package olxmasterservice;

import java.util.List;

import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;

public interface OlxMasterService {
	List<OlxMasterCategory> getAllCategoriest();
	List<OlxMasterStatus> getAllStatus();
}
