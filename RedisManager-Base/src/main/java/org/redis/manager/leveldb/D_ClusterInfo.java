package org.redis.manager.leveldb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class D_ClusterInfo extends D_Level{
	private static final long serialVersionUID = 8364230072739348763L;

	@Override
	String key() {
		return uuid;
	}

	/**
	 * 主键
	 */
	private String uuid;
	
	private String name;
	
	private String cluster_state;
	private Integer cluster_slots_assigned;
	private Integer cluster_slots_ok;
	private Integer cluster_slots_pfail;
	private Integer cluster_slots_fail;
	private Integer cluster_known_nodes;
	private Integer cluster_size;
	private Integer cluster_current_epoch;
	private Integer cluster_my_epoch;
	private Integer cluster_stats_messages_sent;
	private Integer cluster_stats_messages_received;
	private String last_read_host;
	private Integer last_read_port;
}
