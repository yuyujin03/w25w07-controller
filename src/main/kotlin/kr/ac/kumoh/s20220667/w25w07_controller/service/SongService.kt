package kr.ac.kumoh.s20220667.w25w07_controller.service

import kr.ac.kumoh.s20220667.w25w07_controller.Song
import org.springframework.stereotype.Service

@Service
class SongService {
    fun getAllSongs(): List<Song>{
        return listOf(
            Song(1, "Golden", "HUNTR/X")
        )
    }
}