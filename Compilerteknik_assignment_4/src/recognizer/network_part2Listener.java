package recognizer;// Generated from C:\Users\Tobias\network_part2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link network_part2Parser}.
 */
public interface network_part2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link network_part2Parser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull network_part2Parser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull network_part2Parser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4ttl}.
	 * @param ctx the parse tree
	 */
	void enterIpv4ttl(@NotNull network_part2Parser.Ipv4ttlContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4ttl}.
	 * @param ctx the parse tree
	 */
	void exitIpv4ttl(@NotNull network_part2Parser.Ipv4ttlContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4flags}.
	 * @param ctx the parse tree
	 */
	void enterIpv4flags(@NotNull network_part2Parser.Ipv4flagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4flags}.
	 * @param ctx the parse tree
	 */
	void exitIpv4flags(@NotNull network_part2Parser.Ipv4flagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#dumpline}.
	 * @param ctx the parse tree
	 */
	void enterDumpline(@NotNull network_part2Parser.DumplineContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#dumpline}.
	 * @param ctx the parse tree
	 */
	void exitDumpline(@NotNull network_part2Parser.DumplineContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(@NotNull network_part2Parser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(@NotNull network_part2Parser.LengthContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#packet}.
	 * @param ctx the parse tree
	 */
	void enterPacket(@NotNull network_part2Parser.PacketContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#packet}.
	 * @param ctx the parse tree
	 */
	void exitPacket(@NotNull network_part2Parser.PacketContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull network_part2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull network_part2Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4id}.
	 * @param ctx the parse tree
	 */
	void enterIpv4id(@NotNull network_part2Parser.Ipv4idContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4id}.
	 * @param ctx the parse tree
	 */
	void exitIpv4id(@NotNull network_part2Parser.Ipv4idContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#mac}.
	 * @param ctx the parse tree
	 */
	void enterMac(@NotNull network_part2Parser.MacContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#mac}.
	 * @param ctx the parse tree
	 */
	void exitMac(@NotNull network_part2Parser.MacContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4offset}.
	 * @param ctx the parse tree
	 */
	void enterIpv4offset(@NotNull network_part2Parser.Ipv4offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4offset}.
	 * @param ctx the parse tree
	 */
	void exitIpv4offset(@NotNull network_part2Parser.Ipv4offsetContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4adr}.
	 * @param ctx the parse tree
	 */
	void enterIpv4adr(@NotNull network_part2Parser.Ipv4adrContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4adr}.
	 * @param ctx the parse tree
	 */
	void exitIpv4adr(@NotNull network_part2Parser.Ipv4adrContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#entry}.
	 * @param ctx the parse tree
	 */
	void enterEntry(@NotNull network_part2Parser.EntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#entry}.
	 * @param ctx the parse tree
	 */
	void exitEntry(@NotNull network_part2Parser.EntryContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#entries}.
	 * @param ctx the parse tree
	 */
	void enterEntries(@NotNull network_part2Parser.EntriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#entries}.
	 * @param ctx the parse tree
	 */
	void exitEntries(@NotNull network_part2Parser.EntriesContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#protinfo}.
	 * @param ctx the parse tree
	 */
	void enterProtinfo(@NotNull network_part2Parser.ProtinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#protinfo}.
	 * @param ctx the parse tree
	 */
	void exitProtinfo(@NotNull network_part2Parser.ProtinfoContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4proto}.
	 * @param ctx the parse tree
	 */
	void enterIpv4proto(@NotNull network_part2Parser.Ipv4protoContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4proto}.
	 * @param ctx the parse tree
	 */
	void exitIpv4proto(@NotNull network_part2Parser.Ipv4protoContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4}.
	 * @param ctx the parse tree
	 */
	void enterIpv4(@NotNull network_part2Parser.Ipv4Context ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4}.
	 * @param ctx the parse tree
	 */
	void exitIpv4(@NotNull network_part2Parser.Ipv4Context ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#flagvalues}.
	 * @param ctx the parse tree
	 */
	void enterFlagvalues(@NotNull network_part2Parser.FlagvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#flagvalues}.
	 * @param ctx the parse tree
	 */
	void exitFlagvalues(@NotNull network_part2Parser.FlagvaluesContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4tos}.
	 * @param ctx the parse tree
	 */
	void enterIpv4tos(@NotNull network_part2Parser.Ipv4tosContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4tos}.
	 * @param ctx the parse tree
	 */
	void exitIpv4tos(@NotNull network_part2Parser.Ipv4tosContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#protname}.
	 * @param ctx the parse tree
	 */
	void enterProtname(@NotNull network_part2Parser.ProtnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#protname}.
	 * @param ctx the parse tree
	 */
	void exitProtname(@NotNull network_part2Parser.ProtnameContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4content}.
	 * @param ctx the parse tree
	 */
	void enterIpv4content(@NotNull network_part2Parser.Ipv4contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4content}.
	 * @param ctx the parse tree
	 */
	void exitIpv4content(@NotNull network_part2Parser.Ipv4contentContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#ipv4fields}.
	 * @param ctx the parse tree
	 */
	void enterIpv4fields(@NotNull network_part2Parser.Ipv4fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#ipv4fields}.
	 * @param ctx the parse tree
	 */
	void exitIpv4fields(@NotNull network_part2Parser.Ipv4fieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(@NotNull network_part2Parser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(@NotNull network_part2Parser.TimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link network_part2Parser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(@NotNull network_part2Parser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link network_part2Parser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(@NotNull network_part2Parser.TagContext ctx);
}