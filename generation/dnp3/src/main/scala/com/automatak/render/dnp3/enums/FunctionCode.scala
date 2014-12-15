package com.automatak.render.dnp3.enums

import com.automatak.render._


object FunctionCode {

  private val comments = List("Application layer function code enumeration")

  def apply(): EnumModel = EnumModel("FunctionCode", comments, EnumModel.UInt8, codes, Hex)

  private val codes = List(
    EnumValue("CONFIRM",0, "Master sends this to an outstation to confirm the receipt of an Application Layer fragment"),
    EnumValue("READ",1, "Outstation shall return the data specified by the objects in the request"),
    EnumValue("WRITE",2, "Outstation shall store the data specified by the objects in the request"),
    EnumValue("SELECT",3, "Outstation shall select (or arm) the output points specified by the objects in the request in preparation for a subsequent operate command"),
    EnumValue("OPERATE",4, "Outstation shall activate the output points selected (or armed) by a previous select function code command"),
    EnumValue("DIRECT_OPERATE",5,"Outstation shall immediately actuate the output points specified by the objects in the request"),
    EnumValue("DIRECT_OPERATE_NR", 6, "Same as DIRECT_OPERATE but outstation shall not send a response"),
    EnumValue("IMMED_FREEZE",7, "Outstation shall copy the point data values specified by the objects in the request to a separate freeze buffer"),
    EnumValue("IMMED_FREEZE_NR",8, "Same as IMMED_FREEZE but outstation shall not send a response"),
    EnumValue("FREEZE_CLEAR",9, "Outstation shall copy the point data values specified by the objects in the request into a separate freeze buffer and then clear the values"),
    EnumValue("FREEZE_CLEAR_NR",10, "Same as FREEZE_CLEAR but outstation shall not send a response"),
    EnumValue("FREEZE_AT_TIME",11, "Outstation shall copy the point data values specified by the objects in the request to a separate freeze buffer at the time and/or time intervals specified in a special time data information object"),
    EnumValue("FREEZE_AT_TIME_NR",12, "Same as FREEZE_AT_TIME but outstation shall not send a response"),
    EnumValue("COLD_RESTART", 13, "Outstation shall perform a complete reset of all hardware and software in the device"),
    EnumValue("WARM_RESTART", 14, "Outstation shall reset only portions of the device"),
    EnumValue("INITIALIZE_DATA", 15, "Obsolete—Do not use for new designs"),
    EnumValue("INITIALIZE_APPLICATION", 16, "Outstation shall place the applications specified by the objects in the request into the ready to run state"),
    EnumValue("START_APPLICATION", 17, "Outstation shall start running the applications specified by the objects in the request"),
    EnumValue("STOP_APPLICATION", 18, "Outstation shall stop running the applications specified by the objects in the request"),
    EnumValue("SAVE_CONFIGURATION", 19, "This code is deprecated—Do not use for new designs"),
    EnumValue("ENABLE_UNSOLICITED", 20, "Enables outstation to initiate unsolicited responses from points specified by the objects in the request"),
    EnumValue("DISABLE_UNSOLICITED", 21, "Prevents outstation from initiating unsolicited responses from points specified by the objects in the request"),
    EnumValue("ASSIGN_CLASS", 22, "Outstation shall assign the events generated by the points specified by the objects in the request to one of the classes"),
    EnumValue("DELAY_MEASURE", 23, "Outstation shall report the time it takes to process and initiate the transmission of its response"),
    EnumValue("RECORD_CURRENT_TIME", 24, "Outstation shall save the time when the last octet of this message is received"),
    EnumValue("OPEN_FILE", 25, "Outstation shall open a file"),
    EnumValue("CLOSE_FILE", 26, "Outstation shall close a file"),
    EnumValue("DELETE_FILE", 27, "Outstation shall delete a file"),
    EnumValue("GET_FILE_INFO", 28, "Outstation shall retrieve information about a file"),
    EnumValue("AUTHENTICATE_FILE", 29, "Outstation shall return a file authentication key"),
    EnumValue("ABORT_FILE", 30, "Outstation shall abort a file transfer operation"),
    EnumValue("AUTH_REQUEST", 32, "The master uses this function code when sending authentication requests to the outstation"),
    EnumValue("AUTH_REQUEST_NO_ACK", 33, "The master uses this function code when sending authentication requests to the outstation that do no require acknowledgement"),
    EnumValue("RESPONSE", 129, "Master shall interpret this fragment as an Application Layer response to an ApplicationLayer request"),
    EnumValue("UNSOLICITED_RESPONSE", 130, "Master shall interpret this fragment as an unsolicited response that was not prompted by an explicit request"),
    EnumValue("AUTH_RESPONSE", 131, "The outstation uses this function code to issue authentication messages to the master"),
    EnumValue("UNKNOWN", 255, "Unknown function code. Used internally in opendnp3 to indicate the code didn't match anything known")
    )

}



