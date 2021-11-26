package com.softserve.edu.hw05.task1.subtask3;

    public enum Errors {

        BAD_REQUEST (400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402),
        FORBIDDEN(403),NOT_FOUND(404), METHOD_NOT_ALLOWED(405);
        private int errorNumber;
        public int getErrorNumber() {
            return errorNumber;
        }

        Errors(int errorNumber) {
            this.errorNumber = errorNumber;
        }

   }


