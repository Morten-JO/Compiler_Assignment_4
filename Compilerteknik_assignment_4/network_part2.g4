/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar network_part2;

entries : entry*;
entry : date time packet;

date : NUMBER '-' NUMBER '-' NUMBER;
time : NUMBER ':' NUMBER ':' NUMBER '.' NUMBER;


         
     packet : mac '>' mac ',' 'ethertype' type ',' length ':' ipv4content;
     
     
     mac : MAC;
     

     
     type : ipv4;
ipv4 : 'IPv4' tag;
tag : '(' HEXNUMBER ')';

     length : 'length' NUMBER;
     
     ipv4content : ipv4fields ipv4adr '>' ipv4adr ':' protinfo dumpline +;
ipv4fields : '(' ipv4tos ',' ipv4ttl ',' ipv4id ',' ipv4offset ',' ipv4flags ',' ipv4proto ',' length ')';
ipv4adr : NUMBER '.' NUMBER '.' NUMBER '.' NUMBER '.' NUMBER;
ipv4tos : 'tos' HEXNUMBER;
ipv4ttl : 'ttl' NUMBER;
ipv4id : 'id' NUMBER;
ipv4offset : 'offset' NUMBER;
ipv4flags : 'flags' '[' flagvalues ']';
flagvalues : 'none' | 'DF' | 'MF' | 'e';
ipv4proto : 'proto' protname '(' NUMBER ')';
protname : 'ICMP' | 'IGMP' | 'TCP' | 'UDP' | 'PROTO';
protinfo : protname ',' length;
dumpline : HEXNUMBER ':'. + ?;

fragment DIGIT : [0-9];
NUMBER : DIGIT +;
MAC : BYTE ':' BYTE ':' BYTE ':' BYTE ':' BYTE ':' BYTE;
BYTE : HEX HEX;
WORD : HEX HEX HEX HEX;
HEX : [0-9a-fA-F];
HEXNUMBER : '0x' HEX +;

FOO : [!-~];
WHITESPACE : [ \t\r\n] -> skip;