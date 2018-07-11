package com.haoge.dubbo.ticket.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service//将服务发布出去
@Component
public class TicketServiceImpl implements TicketService{
	public String getTicket() {
		return "第一部电影";
	}
}
