package com.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app")
public class ApplicationController {	
	
	@GetMapping(path = "/handlerMethod1")
	public ResponseEntity<String> handlerMethod1(@RequestParam String param){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(param, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod2")
	public ResponseEntity<String[]> handlerMethod2(@RequestParam(name = "param") String[] values){
		ResponseEntity<String[]>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String[]>(values, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String[]>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod3")
	public ResponseEntity<Map<String, String>> handlerMethod3(@RequestParam Map<String, String> params){
		ResponseEntity<Map<String, String>>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Map<String, String>>(params, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String, String>>(HttpStatus.OK);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod4")
	public ResponseEntity<MultiValueMap<String, Object>> handlerMethod4(@RequestParam MultiValueMap<String, Object> params){
		ResponseEntity<MultiValueMap<String, Object>>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<MultiValueMap<String, Object>>(params, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<MultiValueMap<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod5")
	public ResponseEntity<List<String>> handlerMethod5(@RequestParam(value = "param") List<String> params){
		ResponseEntity<List<String>>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<List<String>>(params, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod6")
	public ResponseEntity<String> handlerMethod6(@RequestParam(required = false) String param){
		ResponseEntity<String>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(param, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod7")
	public ResponseEntity<String> handlerMethod7(@RequestParam(defaultValue = "No param value") String param){
		ResponseEntity<String>  responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(param, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}
