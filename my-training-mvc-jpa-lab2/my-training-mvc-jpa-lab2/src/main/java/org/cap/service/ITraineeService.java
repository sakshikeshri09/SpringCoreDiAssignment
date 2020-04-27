package org.cap.service;

import java.util.List;

import org.cap.entities.Trainee;

public interface ITraineeService {

	 Trainee addTrainee(Trainee trainee);
	
	 Trainee deleteTrainee(int traineeId);
	
	 Trainee modifyTrainee(int traineeId,String traineeName,String traineeDomain,String traineeLocation);
	
	 Trainee retrieveTrainee(int traineeId);
	
	 List<Trainee> retrieveall();
	 
	 Trainee findById(int id);
}
