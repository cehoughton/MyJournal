package com.epicodus.myjournal.models;

import java.security.Timestamp;
import java.util.Date;

/**
 * Created by Guest on 5/10/16.
 */
public class Entry {

    public class User {
        private String title;
        private String body;
        private String mood;

        public User() {}

        public User(String title, String body, String mood) {
            this.title = title;
            this.body = body;
            this.mood = mood;
        }

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        public String getMood() {
            return mood;
        }
    }
}
