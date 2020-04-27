package org.cap.service;



import java.util.List;

import javax.transaction.Transactional;
import org.cap.dao.ITraineeDao;
import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TraineeService implements ITraineeService {

	
	 private ITraineeDao dao;
	
	public ITraineeDao getDao() {
		return dao;
	}
	 @Autowired
	public void setDao(ITraineeDao dao) {
		this.dao = dao;
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
	Trainee	train=dao.addTrainee(trainee);
		return train    ;
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {
		Trainee		trainee=dao.deleteTrainee(traineeId);
		return trainee;
	}

	@Override
	public Trainee modifyTrainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		Trainee		trainee=dao.modifyTrainee(traineeId, traineeName, traineeDomain, traineeLocation);
	return	trainee;
	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {
	Trainee trainee	=	dao.retrieveTrainee(traineeId);
			return trainee;
	}

	@Override
	public List<Trainee> retrieveall() {
		
		List<Trainee> list=dao.retrieveall();
		return list;
	}
	@Override
	public Trainee findById(int id) {
		Trainee trainee=dao.findById(id);
		return trainee;
	}

}
