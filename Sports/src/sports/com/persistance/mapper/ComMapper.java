package sports.com.persistance.mapper;

import java.util.List;

import config.Mapper;
import sports.com.dto.TestDTO;

@Mapper("ComMapper")
public interface ComMapper {

	List<TestDTO> getCommentList() throws Exception;
}
