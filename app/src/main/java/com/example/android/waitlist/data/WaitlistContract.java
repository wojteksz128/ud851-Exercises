package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {



    // DONE (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    private class WaitlistEntry implements BaseColumns {

        // DONE (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp
        private static final String TABLE_NAME = "waitlist";
        private static final String COLUMN_GUEST_NAME = "guestName";
        private static final String COLUMN_PARTY_SIZE = "partySize";
        private static final String COLUMN_TIMESTAMP = "timestamp";
    }


}
