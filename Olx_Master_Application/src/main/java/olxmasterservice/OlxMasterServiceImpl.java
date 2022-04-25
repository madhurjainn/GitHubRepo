package olxmasterservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.olxmasterapplication.entity.OlxMasterCategory;
import com.zensar.olxmasterapplication.entity.OlxMasterStatus;
@Service
public class OlxMasterServiceImpl implements OlxMasterService {
	static List<OlxMasterCategory> categoryList = new ArrayList<OlxMasterCategory>();
	static List<OlxMasterStatus> statusList = new ArrayList<OlxMasterStatus>();
	static {
		statusList.add(new OlxMasterStatus(1, "OPEN"));
		statusList.add(new OlxMasterStatus(2, "CLOSED"));
	}
	static {
		categoryList.add(new OlxMasterCategory(1, "Furniture"));
		categoryList.add(new OlxMasterCategory(2, "Cars"));
		categoryList.add(new OlxMasterCategory(4, "RealEstate"));
		categoryList.add(new OlxMasterCategory(5, "Sports"));

	}

	@Override
	public List<OlxMasterCategory> getAllCategoriest() {
		System.out.println("Getting Categories...");
		return categoryList;
	}

	@Override
	public List<OlxMasterStatus> getAllStatus() {
		System.out.println("Getting Status...");
		return statusList;
	}

}
