package com.example.dao;
import java.util.HashMap;
import java.util.List;
import com.example.domain.*;

public interface CouDAO {
	public List<HashMap<String,Object>> list(QueryVO vo);
	public int total(QueryVO vo);
	public HashMap<String,Object> read(String lcode);
}