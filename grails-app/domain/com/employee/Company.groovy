package com.employee

class Company {
    String name
    String address1
    String address2
    String zip
    String state
    String city
    String country
    String phone1
    String phone2
    String fax
    String web
    String email
    String image

    static hasMany = [employee:Employee]


    static constraints = {
    }
}