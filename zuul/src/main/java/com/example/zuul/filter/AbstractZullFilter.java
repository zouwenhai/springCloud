package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.sun.org.apache.bcel.internal.classfile.ConstantValue;

/**
 * @author AbstractZullFilter
 * @version v1.0
 * @date 2019/8/21 18:14
 * @work //TODO
 */
public abstract  class AbstractZullFilter extends ZuulFilter {


    /**
     * 要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤级别
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }





}
