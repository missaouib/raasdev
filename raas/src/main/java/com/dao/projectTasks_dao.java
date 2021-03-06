package com.dao;

import java.security.Principal;
import java.sql.SQLException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.vo.crtproject_vo;
import com.vo.feature_vo;
import com.vo.projectTasks_vo;
import com.vo.projectTasksgp_vo;
import com.vo.user_vo;
import com.wrapper.wrapper;

public interface projectTasks_dao {

	public void saveptaskgroup(feature_vo tasks, int project_id, String username) throws Exception;

	public List<wrapper> gettaskgroup(int project_id) throws Exception;

	public List<wrapper> gettasktype() throws Exception;

	public List<wrapper> gettasksize() throws Exception;

	public List<wrapper> gettaskdetails(int project_id) throws Exception;

	public List<wrapper> gettaskgpbaseddetails(projectTasks_vo taskgp) throws Exception;

	public void taskCreatedActivity(projectTasks_vo taskdetails, MultipartFile file, int project_id, String username) throws Exception;

	public String editTask(projectTasks_vo edtsk) throws Exception;

	public List<wrapper> gettaskviewbaseddetails(projectTasks_vo taskgp) throws Exception;

	public void getUsername(Principal principal, String userName) throws Exception;

	public List<wrapper> getproject_id(int project_id) throws Exception;

	public void getupdatetaskdetail(projectTasks_vo ptv) throws Exception;

	public String editptaskgroup(feature_vo tasks, int project_id) throws Exception;

	public String edittaskdetails(projectTasks_vo taskdetails, MultipartFile file) throws Exception;

	public void deletedetails(int feature_id) throws Exception;

	public List<wrapper> getpriority_code() throws Exception;

	public String loadeditgroup(int task_group_id) throws Exception;
	
	public List<wrapper> getuserrole(String userName) throws Exception;

	

}
