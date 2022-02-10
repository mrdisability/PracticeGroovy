package com.thesamoanppprogrammer.practicegroovy.restapi

import groovy.xml.XmlParser

def rssFeed = new XmlParser()
        .parse("https://news.google.com/rss?hl=en-US&gl=US&ceid=US:en")
def stories = []
(0..4).each {
    def item = rssFeed.channel.item.get(it)
    stories << item.title.text()
}
assert stories.size() == 5

println stories

