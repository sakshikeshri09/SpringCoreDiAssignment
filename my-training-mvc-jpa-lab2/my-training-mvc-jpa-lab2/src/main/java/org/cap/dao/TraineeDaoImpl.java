package org.cap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


import org.cap.entities.Trainee;
import org.cap.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
  
@Repository
public class TraineeDaoImpl implements ITraineeDao {
	
	private EntityManager entityManager;


	public EntityManager getEntityManager() {
		return entityManager;
	}
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		trainee=entityManager.merge(trainee);
		return trainee;
	}

	@Override
	public Trainee deleteTrainee(int traineeId) {

		Trainee trainee=entityManager.find(Trainee.class,traineeId);
		entityManager.remove(trainee);
		return trainee;
	}

	@Override
	public Trainee modifyTrainee(int traineeId, String traineeName, String traineeDomain, String traineeLocation) {
		Trainee trainee=entityManager.find(Trainee.class,traineeId);
		trainee.setTraineeId(traineeId);
		trainee.setTraineeName(traineeName);
		trainee.setTraineeDomain(traineeDomain);
		trainee.setTraineeLocation(traineeLocation);
		trainee=entityManager.merge(trainee);
		return trainee;

	}

	@Override
	public Trainee retrieveTrainee(int traineeId) {
		Trainee trainee=entityManager.find(Trainee.class,traineeId);
		return trainee;

	}

	@Override
	public List<Trainee> retrieveall() {
		String jql = "from Trainee";
		TypedQuery<Trainee> query = entityManager.createQuery(jql, Trainee.class);
		List<Trainee> list = query.getResultList();
		return list;

	}

	public Trainee findById(int id)
	{
		Trainee trainee=entityManager.find(Trainee.class,id);
		return trainee;
	}

}
