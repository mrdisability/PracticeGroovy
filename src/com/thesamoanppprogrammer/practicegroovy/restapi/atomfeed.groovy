package com.thesamoanppprogrammer.practicegroovy.restapi

import groovy.xml.XmlParser

def atomFeed = new XmlParser()
        .parse("https://news.google.com/atom?hl=en-US&gl=US&ceid=US:en")
def stories = []
(0..4).each {
    def entry = atomFeed.entry.get(it)
    stories << entry.title.text()
}
assert stories.size() == 5

println stories

