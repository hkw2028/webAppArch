package com.lge.spring;

import org.springframework.stereotype.Component;

@Component
public class DAOImpl implements IDAO {
	/* (non-Javadoc)
	 * @see com.lge.spring.IDAO#save()
	 */
	@Override
	public void save() {
		System.out.println("저장 중");
	}
	
	/* (non-Javadoc)
	 * @see com.lge.spring.IDAO#search()
	 */
	@Override
	public void search() {
		System.out.println("검색 중");
	}
}
