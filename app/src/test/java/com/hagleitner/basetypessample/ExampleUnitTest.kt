package com.hagleitner.basetypessample

import com.hagleitner.basetypes.qr.HsMDeviceCodeParser
import com.hagleitner.hsmdevicecommunications.BleAdvertisementPayloadParser
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        HsMDeviceCodeParser.parseCode("yourQrCode3separatedRows")
        assertEquals(4, 2 + 2)

//        BleAdvertisementPayloadParser.parseBleAdvertisementWithoutDecryption(manufacturerData: ByteArray)
    }
}