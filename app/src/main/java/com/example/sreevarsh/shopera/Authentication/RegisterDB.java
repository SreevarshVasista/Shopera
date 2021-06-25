package com.example.sreevarsh.shopera.Authentication;

public class RegisterDB {
        String userID;
        String uname;
        String email;

        public RegisterDB(){

        }
        public RegisterDB(String userID, String uname, String email) {
            this.userID = userID;
            this.uname = uname;
            this.email = email;
        }

        public String getUserID() {
            return userID;
        }

        public String getEmail() {
            return email;
        }

        public String getUname() {
            return uname;
        }

}
