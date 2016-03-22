package fr.xebia.xke

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class DataController {

    @RequestMapping("/data")
    @ResponseStatus(value = HttpStatus.CREATED)
    fun create(@RequestBody dataList: List<Data>) {
        println("${dataList.size} elements in POST /data:")
        dataList.forEach { println(it.toString()) }
    }
}