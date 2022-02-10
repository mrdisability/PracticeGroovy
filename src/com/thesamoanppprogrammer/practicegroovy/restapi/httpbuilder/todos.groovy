package com.thesamoanppprogrammer.practicegroovy.restapi.httpbuilder

import groovyx.net.http.RESTClient
import groovyx.net.http.ContentType

String base = 'http://api.icndb.com'

def chuck = new RESTClient(base)
def params = [firstName: "Dan", lastName: "Vega"]

chuck.contentType = ContentType.JSON
chuck.get( path: '/jokes/random', query: params ) { response, json ->
    println response.status
    println json
}