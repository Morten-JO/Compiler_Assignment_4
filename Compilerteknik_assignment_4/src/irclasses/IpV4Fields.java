package irclasses;

/**
 * Date: 25/10/2016
 *
 * Project: Compilerteknik_assignment_2
 *
 * File: IpV4Fields.java
 *
 * Created by: Morten Jørvad
 *
 * Github: https://github.com/Mortenbaws
 *
 * Email: morten2094@gmail.com
 */

public class IpV4Fields {

	private String fields = "";

	public IpV4Fields(IpV4Tos tos, IpV4Ttl ttl, IpV4Id id, IpV4Offset offset, IpV4Flags flags, IpV4Proto proto,
			Length length) {
		this.fields += "(" + tos.getTos() + "," +ttl.getTtl() + "," + id.getId() + "," + offset.getOffset() + "," + flags.getFlags() + "," + proto.getProtocolDesc() + "," + length.getLength() + ")";
	}
	
	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
}