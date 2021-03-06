package com.crp.qa.qaAuthorization.service.inte;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


/**
 * 基础服务接口
 * @author huangyue
 * @date 2018年5月9日 下午9:42:46
 * @ClassName QaSysUserService
 */
public interface BaseService<T> {
	
	public <D> List<D> pojoToDto(Class<D> dClass,Iterable<T> origList) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException;
}
