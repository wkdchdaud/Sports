package sports.com.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import sports.com.dto.TestDTO;
import sports.com.persistance.mapper.ComMapper;
import sports.com.service.IComService;

@Service("ComService")
public class ComService implements IComService{
	@Resource(name="ComMapper")
	private ComMapper comMapper;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public List<TestDTO> getCommentList() throws Exception {
		return comMapper.getCommentList();
	}
}
