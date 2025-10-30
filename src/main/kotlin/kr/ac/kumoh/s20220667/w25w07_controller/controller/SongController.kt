package kr.ac.kumoh.s20220667.w25w07_controller.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController {
    val title = listOf("Golder", "Blue Valentine", "rnicrosoft","타임캡슐")

    @GetMapping("/songs")
    fun getSongList() = title
}