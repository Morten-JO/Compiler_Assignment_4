package recognizer;// Generated from C:\Users\Tobias\network_part2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link network_part2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface network_part2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link network_part2Parser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull network_part2Parser.DateContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4ttl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4ttl(@NotNull network_part2Parser.Ipv4ttlContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4flags(@NotNull network_part2Parser.Ipv4flagsContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#dumpline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDumpline(@NotNull network_part2Parser.DumplineContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull network_part2Parser.LengthContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#packet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacket(@NotNull network_part2Parser.PacketContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull network_part2Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4id(@NotNull network_part2Parser.Ipv4idContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#mac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMac(@NotNull network_part2Parser.MacContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4offset(@NotNull network_part2Parser.Ipv4offsetContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4adr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4adr(@NotNull network_part2Parser.Ipv4adrContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntry(@NotNull network_part2Parser.EntryContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#entries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntries(@NotNull network_part2Parser.EntriesContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#protinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtinfo(@NotNull network_part2Parser.ProtinfoContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4proto(@NotNull network_part2Parser.Ipv4protoContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4(@NotNull network_part2Parser.Ipv4Context ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#flagvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagvalues(@NotNull network_part2Parser.FlagvaluesContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4tos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4tos(@NotNull network_part2Parser.Ipv4tosContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#protname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtname(@NotNull network_part2Parser.ProtnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4content(@NotNull network_part2Parser.Ipv4contentContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#ipv4fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4fields(@NotNull network_part2Parser.Ipv4fieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(@NotNull network_part2Parser.TimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link network_part2Parser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull network_part2Parser.TagContext ctx);
}