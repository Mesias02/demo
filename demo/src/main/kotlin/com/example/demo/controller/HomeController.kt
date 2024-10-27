package com.example.demo.controller

import com.example.demo.model.Model
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import response.SuccessResponse


@RestController
@RequestMapping("/home")
class HomeController {

  /* @GetMapping("/{id}")
    fun home(@PathVariable("id") id:Int): String {
        return "Hello World! + $id"
    }
    @GetMapping()
    fun home(@PathParam("id") id:Int): String {
        return "Hello World! + $id"
    }*/

     /*@GetMapping()
    fun home(@RequestBody model: Model): String {
        return "Hello World!  ${model.id} ${model.name} ${model.age}"
    }*/

   @GetMapping()
    fun home(@RequestBody model: Model): SuccessResponse {
        return SuccessResponse ().apply {
            status = "success"
            data = model
        }
    }

    @GetMapping("/failed")
    fun getModel(@RequestBody model: Model): SuccessResponse {
        return SuccessResponse ().apply {
            status = "failed"
            data = "El campo nombre esta vacio"
        }
    }

    /* @GetMapping()
      fun home(@RequestBody model: Model): ResponseEntity<*> {
          return ResponseEntity (
              SuccessResponse().apply {
              status = "success"
              data = model
          }, HttpStatus.OK
          )
      }*/






}