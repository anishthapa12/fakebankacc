package com.kuebiko.kuebikofakebankacc.validation;

import com.kuebiko.kuebikofakebankacc.models.ProfileModel;

import java.util.Date;

public class ProfileValidation {

    public static  String validateSsn(String ssn) {

        if (ssn == null || ssn.length() == 0) {
            return "ssn cannot be empty";
        }
        if (ssn.length() != 9) {
            return "ssn is not valid !!! it has to be 9 digit";
        }
        try {
            int ssnInt = Integer.parseInt(ssn);
        } catch (Exception exception) {
            return "ssn is not valid! please type numeric values";
        }

        return  null;
    }

    public static String validateProfileData(ProfileModel profileModules) {

        String firstName = profileModules.getFirstName();
        if (firstName == null || firstName.length() == 0) {
            return "first name cannot be empty";
        }
        String lastName = profileModules.getLastName();
        if (lastName == null || lastName.length() == 0) {
            return "last name cannot be empty";
        }
        String address = profileModules.getAddress();
        if (address == null || address.length() == 0) {
            return "address cannot be empty";
        }
        String email = profileModules.getEmail();
        if (email == null || email.length() == 0) {
            return "email cannot be empty";
        }

        String ssn = profileModules.getSsn();


        if (ssn == null || ssn.length() == 0) {
            return "ssn cannot be empty";
        }
        if (ssn.length() != 9) {
            return "ssn is not valid !!! it has to be 9 digit";
        }
        try {
            int ssnInt = Integer.parseInt(ssn);
        } catch (Exception exception) {
            return "ssn is not valid! please type numeric values";
        }

        Date dateOfBirth = profileModules.getDateOfBirth();
        if (dateOfBirth == null) {
            return "Date Of birth cannot be empty";
        }
        Long phoneNumber = profileModules.getPhoneNumber();
        if (phoneNumber == null) {
            return "phone number cannot be empty";
        }
        if (phoneNumber.toString().length() != 10) {
            return "phone number invalid";
        }
        String gender = profileModules.getGender();
        if (gender == null) {
            return "gender cannot be empty";
        }
        if (!gender.equals("m") && !gender.equals("f")) {
            return "gender can only be m or f";
        }
        return null;
    }
}
