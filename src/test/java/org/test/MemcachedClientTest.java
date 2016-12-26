package org.test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.command.BinaryCommandFactory;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

import org.junit.Test;

public class MemcachedClientTest {

	@Test
	public void test() {
		MemcachedClientBuilder builder = new XMemcachedClientBuilder(
				AddrUtil.getAddresses("192.168.24.130:11211"), new int[] { 1, 1, 1, 1 });
		//设置连接池大小，即客户端个数
		builder.setConnectionPoolSize(50);
		//宕机报警
		builder.setFailureMode(true);
		//使用二进制文件
		builder.setCommandFactory(new BinaryCommandFactory());
		
		MemcachedClient client = null;
		
		try {
			client = builder.build();
			client.set("keys", 36000, "set-test");
			System.out.println("before update:" + client.get("keys"));
			
			client.replace("keys",36000, "set-replace");
			System.out.println("after update:" + client.get("keys"));
			
			System.out.println("before delete:" + client.get("keys"));
			client.delete("keys");
			System.out.println("after delete:" + client.get("keys"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
