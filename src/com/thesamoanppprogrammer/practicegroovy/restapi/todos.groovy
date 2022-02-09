package com.thesamoanppprogrammer.practicegroovy.restapi

import groovy.json.JsonSlurper

def getRequest = new URL('https://61e281e83050a100176821ca.mockapi.io/todos')
def getConnection = getRequest.openConnection()
getConnection.requestMethod = 'GET'
assert getConnection.responseCode == 200

JsonSlurper jsonSlurper = new JsonSlurper()
def json = jsonSlurper.parseText(getConnection.getInputStream().text)

for (item in json) {
    println item
}

