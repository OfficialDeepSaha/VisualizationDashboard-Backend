package com.visualization.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class VisualizeController {

	@Autowired
	private VisualizeRepository visualizeRepo;

	@GetMapping("/getdata")
	public ResponseEntity<List<Visualize>> getAllvisualizeData() {

		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage("Data Fetched 👍");
		apiResponse.setStatus(true);

		return new ResponseEntity<List<Visualize>>(visualizeRepo.findAll(), HttpStatus.OK);
	}

}
