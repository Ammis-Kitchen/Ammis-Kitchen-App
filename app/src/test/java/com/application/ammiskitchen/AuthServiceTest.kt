package com.application.ammiskitchen

import com.application.ammiskitchen.data.api.RESTClient
import com.application.ammiskitchen.data.models.request.auth.RequestSendOTP
import com.application.ammiskitchen.data.models.request.auth.RequestVerifyOTP
import com.application.ammiskitchen.data.models.response.auth.ResponseErrorOTP
import com.google.gson.Gson
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test

class AuthServiceTest {

    @Test
    fun `OTP with correct phone returns status OK`() {
        runBlocking {
            val requestSendOTP = RequestSendOTP("+919987746997")
            val response = RESTClient.authService.authGetOTP(requestSendOTP)
            assertEquals("OK", response.body()?.status)
        }
    }

    @Test
    fun `OTP with incorrect phone returns status Bad Request`() {
        runBlocking {
            val requestSendOTP = RequestSendOTP("+91998774699")
            val response = RESTClient.authService.authGetOTP(requestSendOTP)
            val errorResponse: ResponseErrorOTP = Gson().fromJson(response.errorBody()!!.charStream(), ResponseErrorOTP::class.java)
            assertEquals("Bad Request", errorResponse.status)
        }
    }

    @Test
    fun `Verify OTP with incorrect phone returns status Verification Unsuccessful`() {
        runBlocking {
            val requestVerifyOTP = RequestVerifyOTP(
                phoneNumber = "+91998774699",
                otp = "245005"
            )
            val response = RESTClient.authService.authVerifyOTP(requestVerifyOTP)
            val errorResponse: ResponseErrorOTP = Gson().fromJson(response.errorBody()!!.charStream(), ResponseErrorOTP::class.java)
            assertEquals("Verification Unsuccessful.", errorResponse.status)
        }
    }

    @Test
    fun `Verify OTP with incorrect OTP returns status Unauthorized`() {
        runBlocking {
            val requestVerifyOTP = RequestVerifyOTP(
                phoneNumber = "+919987746997",
                otp = "111111"
            )
            val response = RESTClient.authService.authVerifyOTP(requestVerifyOTP)
            val errorResponse: ResponseErrorOTP = Gson().fromJson(response.errorBody()!!.charStream(), ResponseErrorOTP::class.java)
            assertEquals("Unauthorized", errorResponse.status)
        }
    }

    @Test
    fun `Verify OTP with correct details returns status OK`() {
        runBlocking {
            val requestVerifyOTP = RequestVerifyOTP(
                phoneNumber = "+919987746997",
                otp = "245005"
            )
            val response = RESTClient.authService.authVerifyOTP(requestVerifyOTP)
            assertEquals("OK", response.body()?.status)
        }
    }
}