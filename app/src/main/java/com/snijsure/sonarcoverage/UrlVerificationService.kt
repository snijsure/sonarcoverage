package com.snijsure.sonarcoverage

import java.util.regex.Pattern

class UrlVerificationService {

    private val WEB_URL: Pattern = Pattern.compile(
            "\\b(" +
                    "(?:" +
                    "https?:(?:\\/{1,3}|[a-z0-9%])" +
                    "|" +
                    "www\\d{0,3}[.]" +
                    "|" +
                    "[a-z0-9.\\-]+[.][a-z]+\\/" +
                    ")" +
                    "(?:" +
                    "[^\\s()\\[\\]<>]" +
                    "|" +
                    "\\((?:" +
                    "[^\\s()\\[\\]<>]" +
                    "|" +
                    "(?:\\([^s()\\[\\]<>]\\))" +
                    ")*\\)" +
                    ")+" +
                    "(?:" +
                    "\\((?:" +
                    "[^\\s()\\[\\]<>]" +
                    "|" +
                    "(?:\\([^\\s()\\[\\]<>]+\\))" +
                    ")*\\)" +
                    "|" +
                    "[^&=\\s`!()\\[\\];:\'\".,<>?«»“”‘’]" +
                    ")" +
                    ")"
    )

    fun urlMatches(urlInput: String) : Boolean {
        return WEB_URL.matcher(urlInput).matches()
    }
}