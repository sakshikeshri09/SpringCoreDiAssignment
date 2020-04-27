package org.cap.dao;

import java.util.List;

import org.cap.entities.Trainee;

public interface ITraineeDao {

	public Trainee addTrainee(Trainee trainee);
	
	public Trainee deleteTrainee(int traineeId);
	
	public Trainee modifyTrainee(int traineeId,String traineeName,String traineeDomain,String traineeLocation);
	
	public Trainee retrieveTrainee(int traineeId);
	
	public List<Trainee> retrieveall();
	
	public Trainee findById(int id);
}
