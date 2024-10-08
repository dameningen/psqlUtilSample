package com.example.demo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * VueのSPAを返す。存在しないURLへのアクセス時はHtml5HistoryModeResourceConfigで返す。
 */
@Controller
public class BaseController {
    @GetMapping(path = "/")
    public String getSpa() {
        return "forward:index.html";
    }
}