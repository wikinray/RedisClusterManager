package org.redis.manager.model;

public class M_info {

	private String hostname;
	
	private Integer port;
	/**
	 * 由 Redis 分配器分配的内存总量，以字节（byte）为单位
	 */
	private Long used_memory;
	/**
	 * 从操作系统的角度，返回 Redis 已分配的内存总量（俗称常驻集大小）。这个值和 top 、 ps等命令的输出一致
	 */
	private Long used_memory_rss;
	/**
	 *  服务器已接受的连接请求数量。
	 */
	private Long total_connections_received;
	/**
	 * 服务器已执行的命令数量。
	 */
	private Long total_commands_processed;
	/**
	 * 服务器每秒钟执行的命令数量。
	 */
	private Long instantaneous_ops_per_sec;
	/**
	 * 网络输出总长度
	 */
	private Long total_net_input_bytes;
	/**
	 * 网络输出总长度
	 */
	private Long total_net_output_bytes;
	/**
	 * 运行以来过期的 key 的数量
	 */
	private Long expired_keys;
	/**
	 * 运行以来删除过的key的数量
	 */
	private Long evicted_keys;
	/**
	 * 命中 key 的次数
	 */
	private Long keyspace_hits;
	/**
	 * 不命中 key 的次数
	 */
	private Long keyspace_misses;
	
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Long getUsed_memory() {
		return used_memory;
	}
	public void setUsed_memory(Long used_memory) {
		this.used_memory = used_memory;
	}
	public Long getUsed_memory_rss() {
		return used_memory_rss;
	}
	public void setUsed_memory_rss(Long used_memory_rss) {
		this.used_memory_rss = used_memory_rss;
	}
	public Long getTotal_connections_received() {
		return total_connections_received;
	}
	public void setTotal_connections_received(Long total_connections_received) {
		this.total_connections_received = total_connections_received;
	}
	public Long getTotal_commands_processed() {
		return total_commands_processed;
	}
	public void setTotal_commands_processed(Long total_commands_processed) {
		this.total_commands_processed = total_commands_processed;
	}
	public Long getInstantaneous_ops_per_sec() {
		return instantaneous_ops_per_sec;
	}
	public void setInstantaneous_ops_per_sec(Long instantaneous_ops_per_sec) {
		this.instantaneous_ops_per_sec = instantaneous_ops_per_sec;
	}
	public Long getTotal_net_input_bytes() {
		return total_net_input_bytes;
	}
	public void setTotal_net_input_bytes(Long total_net_input_bytes) {
		this.total_net_input_bytes = total_net_input_bytes;
	}
	public Long getTotal_net_output_bytes() {
		return total_net_output_bytes;
	}
	public void setTotal_net_output_bytes(Long total_net_output_bytes) {
		this.total_net_output_bytes = total_net_output_bytes;
	}
	public Long getExpired_keys() {
		return expired_keys;
	}
	public void setExpired_keys(Long expired_keys) {
		this.expired_keys = expired_keys;
	}
	public Long getEvicted_keys() {
		return evicted_keys;
	}
	public void setEvicted_keys(Long evicted_keys) {
		this.evicted_keys = evicted_keys;
	}
	public Long getKeyspace_hits() {
		return keyspace_hits;
	}
	public void setKeyspace_hits(Long keyspace_hits) {
		this.keyspace_hits = keyspace_hits;
	}
	public Long getKeyspace_misses() {
		return keyspace_misses;
	}
	public void setKeyspace_misses(Long keyspace_misses) {
		this.keyspace_misses = keyspace_misses;
	}
	@Override
	public String toString() {
		return "{used_memory : " + used_memory + " , used_memory_rss : " + used_memory_rss
				+ " , total_connections_received : " + total_connections_received + " , total_commands_processed : "
				+ total_commands_processed + " , instantaneous_ops_per_sec : " + instantaneous_ops_per_sec
				+ " , total_net_input_bytes : " + total_net_input_bytes + " , total_net_output_bytes : "
				+ total_net_output_bytes + " , expired_keys : " + expired_keys + " , evicted_keys : " + evicted_keys
				+ " , keyspace_hits : " + keyspace_hits + " , keyspace_misses : " + keyspace_misses + " }";
	}
}

