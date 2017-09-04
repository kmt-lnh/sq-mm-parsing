package com.sap.xi.tf;
// beginning of import 93473a7344419b15c4219cc2b6c64c6f
import com.sap.aii.mapping.api.*;
import com.sap.aii.mapping.lookup.*;
import com.sap.aii.mappingtool.tf7.rt.*;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;

// end of import 93473a7344419b15c4219cc2b6c64c6f

import java.text.SimpleDateFormat;
import com.sap.aii.ib.bom.flib.types.CalendarPropertiesValue;
import com.sap.aii.mappingtool.tf7.rt.ResultList;
import com.sap.aii.ib.bom.flib.types.FixedValuesTable;
import com.sap.aii.ib.bom.flib.types.KeepSuppresses;
import com.sap.aii.ib.bom.flib.types.ValueMappingStrategy;
import com.sap.aii.mappingtool.tfapi.*;
import com.sap.aii.mappingtool.tf7.*;
import com.sap.aii.mappingtool.flib7.*;



 public class /*!_$ClNRep_*/_MM_INVOIC96A_TO_INVOIC02_ extends AMappingProgram{
   private MT$InnerLibsList libs=new MT$InnerLibsList();
   private MT$InnerParamsList params = new MT$InnerParamsList();
   AStructureNode a$;
IResIterator a$1;
AStructureNode a$2;
MethodSignature  ms$;
AStructureNode a$3;
MethodSignature  ms$4;
MethodSignature  ms$5;
AStructureNode a$6;
MethodSignature  ms$7;
AStructureNode a$8;
AStructureNode a$9;
AStructureNode a$10;
MethodSignature  ms$11;
AStructureNode a$12;
AStructureNode a$13;
AStructureNode a$14;
MethodSignature  ms$15;
AStructureNode a$16;
MethodSignature  ms$17;
AStructureNode a$18;
AStructureNode a$19;
AStructureNode a$20;
AStructureNode a$21;
AStructureNode a$22;
MethodSignature  ms$23;
AStructureNode a$24;
MethodSignature  ms$25;
MethodSignature  ms$26;
AStructureNode a$27;
AStructureNode a$28;
MethodSignature  ms$29;
AStructureNode a$30;
MethodSignature  ms$31;
MethodSignature  ms$32;
AStructureNode a$33;
AStructureNode a$34;
MethodSignature  ms$35;
AStructureNode a$36;
MethodSignature  ms$37;
AStructureNode a$38;
AStructureNode a$39;
AStructureNode a$40;
AStructureNode a$41;
MethodSignature  ms$42;
AStructureNode a$43;
AStructureNode a$44;
MethodSignature  ms$45;
IResIterator a$46;
MethodSignature  ms$47;
FunctionWrapper a$48;
MethodSignature  ms$49;
MethodSignature  ms$50;
FunctionWrapper a$51;
MethodSignature  ms$52;
FunctionWrapper a$53;
MethodSignature  ms$54;
MethodSignature  ms$55;
Q2QFunctionWrapper a$56;
MethodSignature  ms$57;
C2CFunctionWrapper a$58;
AStructureNode a$59;
MethodSignature  ms$60;
MethodSignature  ms$61;
MethodSignature  ms$62;
MethodSignature  ms$63;
MethodSignature  ms$64;
MethodSignature  ms$65;
MethodSignature  ms$66;
MethodSignature  ms$67;
MethodSignature  ms$68;
MethodSignature  ms$69;
MethodSignature  ms$70;
MethodSignature  ms$71;
AStructureNode a$72;
MethodSignature  ms$73;
MethodSignature  ms$74;
MethodSignature  ms$75;
MethodSignature  ms$76;
AStructureNode a$77;
AStructureNode a$78;
AStructureNode a$79;
AStructureNode a$80;
AStructureNode a$81;
AStructureNode a$82;
AStructureNode a$83;
AStructureNode a$84;
AStructureNode a$85;
AStructureNode a$86;
AStructureNode a$87;
AStructureNode a$88;
AStructureNode a$89;
AStructureNode a$90;
AStructureNode a$91;
AStructureNode a$92;
AStructureNode a$93;
AStructureNode a$94;
AStructureNode a$95;
AStructureNode a$96;
AStructureNode a$97;
MethodSignature  ms$98;
MethodSignature  ms$99;
MethodSignature  ms$100;
AStructureNode a$101;
MethodSignature  ms$102;
Properties a$103;
FixedValuesTable mt$fvt$;
MethodSignature  ms$104;
MethodSignature  ms$105;
MethodSignature  ms$106;
MethodSignature  ms$107;
AStructureNode a$108;
AStructureNode a$109;
AStructureNode a$110;
AStructureNode a$111;
AStructureNode a$112;
AStructureNode a$113;
AStructureNode a$114;
AStructureNode a$115;
AStructureNode a$116;
AStructureNode a$117;
AStructureNode a$118;
AStructureNode a$119;
AStructureNode a$120;
AStructureNode a$121;
AStructureNode a$122;
AStructureNode a$123;
AStructureNode a$124;
AStructureNode a$125;
AStructureNode a$126;
AStructureNode a$127;
AStructureNode a$128;
AStructureNode a$129;
AStructureNode a$130;
AStructureNode a$131;
AStructureNode a$132;
AStructureNode a$133;
AStructureNode a$134;
AStructureNode a$135;
AStructureNode a$136;
AStructureNode a$137;
AStructureNode a$138;
AStructureNode a$139;
AStructureNode a$140;
AStructureNode a$141;
AStructureNode a$142;
AStructureNode a$143;
AStructureNode a$144;
AStructureNode a$145;
AStructureNode a$146;
AStructureNode a$147;
AStructureNode a$148;
MethodSignature  ms$149;
MethodSignature  ms$150;
MethodSignature  ms$151;
AStructureNode a$152;
MethodSignature  ms$153;
FixedValuesTable mt$fvt$154;
AStructureNode a$155;
MethodSignature  ms$156;
MethodSignature  ms$157;
MethodSignature  ms$158;
AStructureNode a$159;
MethodSignature  ms$160;
FixedValuesTable mt$fvt$161;
MethodSignature  ms$162;
MethodSignature  ms$163;
MethodSignature  ms$164;
IResIterator a$165;
MethodSignature  ms$166;
MethodSignature  ms$167;
MethodSignature  ms$168;
MethodSignature  ms$169;
MethodSignature  ms$170;
MethodSignature  ms$171;
MethodSignature  ms$172;
FixedValuesTable mt$fvt$173;
MethodSignature  ms$174;
MethodSignature  ms$175;
MethodSignature  ms$176;
AStructureNode a$177;
AStructureNode a$178;
AStructureNode a$179;
AStructureNode a$180;
AStructureNode a$181;
AStructureNode a$182;
AStructureNode a$183;
AStructureNode a$184;
MethodSignature  ms$185;
MethodSignature  ms$186;
MethodSignature  ms$187;
AStructureNode a$188;
MethodSignature  ms$189;
MethodSignature  ms$190;
MethodSignature  ms$191;
AStructureNode a$192;
AStructureNode a$193;
AStructureNode a$194;
AStructureNode a$195;
AStructureNode a$196;
AStructureNode a$197;
MethodSignature  ms$198;
AStructureNode a$199;
MethodSignature  ms$200;
AStructureNode a$201;
MethodSignature  ms$202;
MethodSignature  ms$203;
MethodSignature  ms$204;
AStructureNode a$205;
AStructureNode a$206;
MethodSignature  ms$207;
MethodSignature  ms$208;
MethodSignature  ms$209;
AStructureNode a$210;
MethodSignature  ms$211;
MethodSignature  ms$212;
MethodSignature  ms$213;
MethodSignature  ms$214;
MethodSignature  ms$215;
AStructureNode a$216;
AStructureNode a$217;
AStructureNode a$218;
AStructureNode a$219;
AStructureNode a$220;
AStructureNode a$221;
AStructureNode a$222;
AStructureNode a$223;
AStructureNode a$224;
AStructureNode a$225;
AStructureNode a$226;
AStructureNode a$227;
AStructureNode a$228;
AStructureNode a$229;
AStructureNode a$230;
AStructureNode a$231;
AStructureNode a$232;
AStructureNode a$233;
AStructureNode a$234;
AStructureNode a$235;
AStructureNode a$236;
AStructureNode a$237;
AStructureNode a$238;
AStructureNode a$239;
AStructureNode a$240;
AStructureNode a$241;
AStructureNode a$242;
AStructureNode a$243;
AStructureNode a$244;
AStructureNode a$245;
AStructureNode a$246;
AStructureNode a$247;
AStructureNode a$248;
AStructureNode a$249;
AStructureNode a$250;
AStructureNode a$251;
AStructureNode a$252;
AStructureNode a$253;
AStructureNode a$254;
AStructureNode a$255;
AStructureNode a$256;
AStructureNode a$257;
AStructureNode a$258;
AStructureNode a$259;
AStructureNode a$260;
AStructureNode a$261;
AStructureNode a$262;
MethodSignature  ms$263;
MethodSignature  ms$264;
AStructureNode a$265;
MethodSignature  ms$266;
AStructureNode a$267;
MethodSignature  ms$268;
FixedValuesTable mt$fvt$269;
AStructureNode a$270;
AStructureNode a$271;
AStructureNode a$272;
AStructureNode a$273;
AStructureNode a$274;
MethodSignature  ms$275;
MethodSignature  ms$276;
AStructureNode a$277;
MethodSignature  ms$278;
AStructureNode a$279;
MethodSignature  ms$280;
FixedValuesTable mt$fvt$281;
AStructureNode a$282;
AStructureNode a$283;
AStructureNode a$284;
AStructureNode a$285;
AStructureNode a$286;
MethodSignature  ms$287;
MethodSignature  ms$288;
AStructureNode a$289;
MethodSignature  ms$290;
AStructureNode a$291;
MethodSignature  ms$292;
FixedValuesTable mt$fvt$293;
AStructureNode a$294;
AStructureNode a$295;
AStructureNode a$296;
AStructureNode a$297;
AStructureNode a$298;
MethodSignature  ms$299;
MethodSignature  ms$300;
MethodSignature  ms$301;
AStructureNode a$302;
MethodSignature  ms$303;
FixedValuesTable mt$fvt$304;
AStructureNode a$305;

   public /*!_$ClNRep_*/_MM_INVOIC96A_TO_INVOIC02_(){}
   public void registerNeededValues(){storage.registerRequest(1, "/ns0:INVOIC96A/M_INVOIC", "/ns0:INVOIC96A", "");storage.registerRequest(2, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6347", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(3, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6343", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(4, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6345", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(5, "/ns0:INVOIC96A/M_INVOIC/G_SG7", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(6, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6347", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(7, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6345", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(8, "/ns0:INVOIC96A/M_INVOIC/G_SG7", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(9, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6347", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(10, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6343", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(11, "/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/D_5402", "/ns0:INVOIC96A/M_INVOIC/G_SG7", "");storage.registerRequest(12, "/ns0:INVOIC96A/M_INVOIC/G_SG7", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(13, "/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1153", "/ns0:INVOIC96A/M_INVOIC/G_SG1", "");storage.registerRequest(14, "/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1154", "/ns0:INVOIC96A/M_INVOIC/G_SG1", "");storage.registerRequest(15, "/ns0:INVOIC96A/M_INVOIC/G_SG1", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(16, "/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/D_3035", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(17, "/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/D_3035", "/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD", "");storage.registerRequest(18, "/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/D_3035", "/ns0:INVOIC96A/M_INVOIC/G_SG2", "");storage.registerRequest(19, "/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/C_C082/D_3039", "/ns0:INVOIC96A/M_INVOIC/G_SG2", "");storage.registerRequest(20, "/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1153", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(21, "/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1153", "/ns0:INVOIC96A/M_INVOIC/G_SG1", "");storage.registerRequest(22, "/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1154", "/ns0:INVOIC96A/M_INVOIC/G_SG1", "");storage.registerRequest(23, "/ns0:INVOIC96A/M_INVOIC/G_SG1/S_DTM/C_C507/D_2380", "/ns0:INVOIC96A/M_INVOIC/G_SG1", "");storage.registerRequest(24, "/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2005", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(25, "/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2005", "/ns0:INVOIC96A/M_INVOIC/S_DTM", "");storage.registerRequest(26, "/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2380", "/ns0:INVOIC96A/M_INVOIC/S_DTM", "");storage.registerRequest(27, "/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2379", "/ns0:INVOIC96A/M_INVOIC/S_DTM", "");storage.registerRequest(28, "/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2380", "/ns0:INVOIC96A/M_INVOIC/S_DTM", "");storage.registerRequest(29, "/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2379", "/ns0:INVOIC96A/M_INVOIC/S_DTM", "");storage.registerRequest(30, "/ns0:INVOIC96A/M_INVOIC/G_SG15/S_ALC/D_5463", "/ns0:INVOIC96A/M_INVOIC/G_SG15", "");storage.registerRequest(31, "/ns0:INVOIC96A/M_INVOIC/G_SG15", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(32, "/ns0:INVOIC96A/M_INVOIC/G_SG15/S_ALC/D_5463", "/ns0:INVOIC96A/M_INVOIC/G_SG15", "");storage.registerRequest(33, "/ns0:INVOIC96A/M_INVOIC/G_SG15/S_ALC/C_C214/D_7161", "/ns0:INVOIC96A/M_INVOIC/G_SG15", "");storage.registerRequest(34, "/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19/S_MOA/C_C516/D_5025", "/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19", "");storage.registerRequest(35, "/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19/S_MOA/C_C516/D_5004", "/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19", "");storage.registerRequest(36, "/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19", "/ns0:INVOIC96A/M_INVOIC/G_SG15", "");storage.registerRequest(37, "/ns0:INVOIC96A/M_INVOIC/G_SG50/S_TAX/D_5283", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(38, "/ns0:INVOIC96A/M_INVOIC/G_SG50/S_TAX/C_C241/D_5153", "/ns0:INVOIC96A/M_INVOIC/G_SG50", "");storage.registerRequest(39, "/ns0:INVOIC96A/M_INVOIC/G_SG50/S_TAX/C_C243/D_5278", "/ns0:INVOIC96A/M_INVOIC/G_SG50", "");storage.registerRequest(40, "/ns0:INVOIC96A/M_INVOIC/G_SG50/S_MOA/C_C516/D_5025", "/ns0:INVOIC96A/M_INVOIC/G_SG50", "");storage.registerRequest(41, "/ns0:INVOIC96A/M_INVOIC/G_SG50/S_MOA/C_C516/D_5004", "/ns0:INVOIC96A/M_INVOIC/G_SG50", "");storage.registerRequest(42, "/ns0:INVOIC96A/M_INVOIC/G_SG25", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(43, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/D_1082", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(44, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6063", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(45, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6060", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(46, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6063", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(47, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6411", "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY", "");storage.registerRequest(48, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(49, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/C_C212/D_7143", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(50, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/C_C212/D_7143", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(51, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/C_C212/D_7140", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(52, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA/C_C212_1/D_7143", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(53, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA/C_C212_1/D_7143", "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA", "");storage.registerRequest(54, "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA/C_C212_1/D_7140", "/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA", "");storage.registerRequest(55, "/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/D_5025", "/ns0:INVOIC96A/M_INVOIC/G_SG25", "");storage.registerRequest(56, "/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/D_5025", "/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516", "");storage.registerRequest(57, "/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/D_5004", "/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516", "");storage.registerRequest(58, "/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/D_5025", "/ns0:INVOIC96A/M_INVOIC", "");storage.registerRequest(59, "/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/D_5025", "/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516", "");storage.registerRequest(60, "/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/D_5004", "/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516", "");}
   protected void __CreateStructures(){ a$=AStructureNode.createNode(1, "INVOIC02",new DummyIterator(this),1,1,null,1); root=(StructureNode)a$; 
//Src[/ns0:INVOIC96A/M_INVOIC]
 
 a$1 = new NodeArgWrapper(1, storage); a$2=AStructureNode.createNode(1, "IDOC",a$1,1,-1,null,17); a$.addChildElement(a$2); 
//= const 
ms$=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$3=AStructureNode.createNode(3, "BEGIN",a$1,1,1,null,0); a$2.addChildElement(a$3); 
//= const 
ms$4=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "");
 a$3=AStructureNode.createNode(1, "EDI_DC40",a$1,1,1,null,37); a$2.addChildElement(a$3); 
//= const 
ms$5=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$6=AStructureNode.createNode(3, "SEGMENT",a$1,1,1,null,0); a$3.addChildElement(a$6); 
//= const 
ms$7=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "EDI_DC40");
 a$6=AStructureNode.createNode(1, "TABNAM",a$1,1,1,null,0); a$3.addChildElement(a$6); 
//= const 
ms$11=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "2");
 a$12=AStructureNode.createNode(1, "DIRECT",a$1,1,1,null,0); a$3.addChildElement(a$12); 
//= const 
ms$15=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "INVOIC02");
 a$16=AStructureNode.createNode(1, "IDOCTYP",a$1,1,1,null,0); a$3.addChildElement(a$16); 
//= const 
ms$17=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "INVOIC");
 a$18=AStructureNode.createNode(1, "MESTYP",a$1,1,1,null,0); a$3.addChildElement(a$18); 
//= const 
ms$23=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "SNDPOR");
 a$24=AStructureNode.createNode(1, "SNDPOR",a$1,1,1,null,0); a$3.addChildElement(a$24); 
//= const 
ms$25=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "SNDPRT");
 a$24=AStructureNode.createNode(1, "SNDPRT",a$1,1,1,null,0); a$3.addChildElement(a$24); 
//= const 
ms$26=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "SNDPRN");
 a$27=AStructureNode.createNode(1, "SNDPRN",a$1,1,1,null,0); a$3.addChildElement(a$27); 
//= const 
ms$29=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "RCVPOR");
 a$30=AStructureNode.createNode(1, "RCVPOR",a$1,1,1,null,0); a$3.addChildElement(a$30); 
//= const 
ms$31=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "RCVPRT");
 a$30=AStructureNode.createNode(1, "RCVPRT",a$1,0,1,null,0); a$3.addChildElement(a$30); 
//= const 
ms$32=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "RCVPRN");
 a$33=AStructureNode.createNode(1, "RCVPRN",a$1,1,1,null,0); a$3.addChildElement(a$33); 
//= currentDate 
ms$35=new MethodSignature(new Class[]{SimpleDateFormat.class, CalendarPropertiesValue.class}, new String[]{"oform", "calend"}); 
a$1 = new com.sap.aii.mappingtool.flib7.CurDate(this); 
a$1.setParameter("oform", new SimpleDateFormat("yyyyMMdd"));
 
a$1.setParameter("calend", new CalendarPropertiesValue(1, 1, true));
 a$36=AStructureNode.createNode(1, "CREDAT",a$1,0,1,null,0); a$3.addChildElement(a$36); 
//= currentDate 
ms$37=new MethodSignature(new Class[]{SimpleDateFormat.class, CalendarPropertiesValue.class}, new String[]{"oform", "calend"}); 
a$1 = new com.sap.aii.mappingtool.flib7.CurDate(this); 
a$1.setParameter("oform", new SimpleDateFormat("HHmmss"));
 
a$1.setParameter("calend", new CalendarPropertiesValue(1, 1, true));
 a$36=AStructureNode.createNode(1, "CRETIM",a$1,0,1,null,0); a$3.addChildElement(a$36); a$3=AStructureNode.createNode(1, "E1EDK01",new DummyIterator(this),1,1,null,33); a$2.addChildElement(a$3); 
//= const 
ms$42=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$43=AStructureNode.createNode(3, "SEGMENT",a$1,1,1,null,0); a$3.addChildElement(a$43); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6347]
 
 a$1 = new NodeArgWrapper(2, storage); 
//= const 
ms$45=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "2");
 
//= stringEquals 
ms$47=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$48 = new FunctionWrapper(ms$47, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$47); a$48.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>;
 a$48.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=2);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6343]
 
 a$1 = new NodeArgWrapper(3, storage); 
//= const 
ms$49=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "4");
 
//= stringEquals 
ms$50=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$51 = new FunctionWrapper(ms$50, this);mt$prepareFunc(a$51,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$50); a$51.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>;
 a$51.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=4);
 
//= and 
ms$52=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$53 = new FunctionWrapper(ms$52, this);mt$prepareFunc(a$53,"com.sap.aii.mappingtool.flib7.Bool", "and", ms$52); a$53.setArgument(0,a$48);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2));
 a$53.setArgument(1,a$51);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6345]
 
 a$1 = new NodeArgWrapper(4, storage); 
//= ifWithoutElse 
ms$54=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$46 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$46.setArgument(0,a$53);//<html><body><font color=#808000><b>and</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2)), <html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4)));
 a$46.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6345</b><font color=black>;
 
a$46.setParameter("keepss", new KeepSuppresses(true));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7]
 
 a$1 = new NodeArgWrapper(5, storage); 
//= formatByExample 
ms$55=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$55, this);mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$55); a$56.setArgument(0,a$46);//<html><body><font color=#808000><b>ifWithoutElse</b></font>(<html><body><font color=#808000><b>and</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2)), <html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4))), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6345</b><font color=black>, keepss=true);
 a$56.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG7</b><font color=black>;
 
//= mapWithDefault 
ms$57=new MethodSignature(new Class[]{String[].class, String.class, ResultList.class}, new String[]{null, "default_value", null}); 
a$58 = new C2CFunctionWrapper(ms$57, this);mt$prepareFunc(a$58,"com.sap.aii.mappingtool.flib7.NodeFunctions", "mapWithDefault", ms$57); a$58.setArgument(0,a$56);//<html><body><font color=#808000><b>formatByExample</b></font>(<html><body><font color=#808000><b>ifWithoutElse</b></font>(<html><body><font color=#808000><b>and</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2)), <html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4))), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6345</b><font color=black>, keepss=true), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG7</b><font color=black>, result);
 
a$58.setParameter("default_value", "EUR");
 a$59=AStructureNode.createNode(1, "CURCY",a$58,0,1,null,0); a$3.addChildElement(a$59); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6347]
 
 a$46 = new NodeArgWrapper(6, storage); 
//= const 
ms$60=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "3");
 
//= stringEquals 
ms$61=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$48 = new FunctionWrapper(ms$61, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$61); a$48.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>;
 a$48.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=3);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6345]
 
 a$46 = new NodeArgWrapper(7, storage); 
//= ifWithoutElse 
ms$62=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$1 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$1.setArgument(0,a$48);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=3));
 a$1.setArgument(1,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6345</b><font color=black>;
 
a$1.setParameter("keepss", new KeepSuppresses(true));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7]
 
 a$46 = new NodeArgWrapper(8, storage); 
//= formatByExample 
ms$63=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$63, this);mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$63); a$56.setArgument(0,a$1);//<html><body><font color=#808000><b>ifWithoutElse</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=3)), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6345</b><font color=black>, keepss=true);
 a$56.setArgument(1,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG7</b><font color=black>;
 a$59=AStructureNode.createNode(1, "HWAER",a$56,0,1,null,0); a$3.addChildElement(a$59); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6347]
 
 a$1 = new NodeArgWrapper(9, storage); 
//= const 
ms$64=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "2");
 
//= stringEquals 
ms$65=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$51 = new FunctionWrapper(ms$65, this);mt$prepareFunc(a$51,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$65); a$51.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>;
 a$51.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=2);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/C_C504_1/D_6343]
 
 a$1 = new NodeArgWrapper(10, storage); 
//= const 
ms$66=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "4");
 
//= stringEquals 
ms$67=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$53 = new FunctionWrapper(ms$67, this);mt$prepareFunc(a$53,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$67); a$53.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>;
 a$53.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=4);
 
//= and 
ms$68=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$48 = new FunctionWrapper(ms$68, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.Bool", "and", ms$68); a$48.setArgument(0,a$51);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2));
 a$48.setArgument(1,a$53);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7/S_CUX/D_5402]
 
 a$1 = new NodeArgWrapper(11, storage); 
//= ifWithoutElse 
ms$69=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$46 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$46.setArgument(0,a$48);//<html><body><font color=#808000><b>and</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2)), <html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4)));
 a$46.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/<font color=green><b>D_5402</b><font color=black>;
 
a$46.setParameter("keepss", new KeepSuppresses(true));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG7]
 
 a$1 = new NodeArgWrapper(12, storage); 
//= formatByExample 
ms$70=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$70, this);
mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$70);
a$56.setArgument(0,a$46);//<html><body><font color=#808000><b>ifWithoutElse</b></font>(<html><body><font color=#808000><b>and</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6347</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=2)), <html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/C_C504_1/<font color=green><b>D_6343</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=4))), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG7</b><font color=gray>/S_CUX/<font color=green><b>D_5402</b><font color=black>, keepss=true);
 a$56.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG7</b><font color=black>;
 a$59=AStructureNode.createNode(1, "WKURS",a$56,0,1,null,0); a$3.addChildElement(a$59); 
//= const 
ms$71=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "INVO");
 a$72=AStructureNode.createNode(1, "BSART",a$46,0,1,null,0); a$3.addChildElement(a$72); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1153]
 
 a$1 = new NodeArgWrapper(13, storage); 
//= const 
ms$73=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "DM");
 
//= stringEquals 
ms$74=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$51 = new FunctionWrapper(ms$74, this);mt$prepareFunc(a$51,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$74); a$51.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG1</b><font color=gray>/S_RFF/C_C506/<font color=green><b>D_1153</b><font color=black>;
 a$51.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=DM);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1154]
 
 a$1 = new NodeArgWrapper(14, storage); 
//= ifWithoutElse 
ms$75=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$46 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$46.setArgument(0,a$51);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG1</b><font color=gray>/S_RFF/C_C506/<font color=green><b>D_1153</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=DM));
 a$46.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG1</b><font color=gray>/S_RFF/C_C506/<font color=green><b>D_1154</b><font color=black>;
 
a$46.setParameter("keepss", new KeepSuppresses(true));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1]
 
 a$1 = new NodeArgWrapper(15, storage); 
//= formatByExample 
ms$76=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$76, this);mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$76); a$56.setArgument(0,a$46);//<html><body><font color=#808000><b>ifWithoutElse</b></font>(<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG1</b><font color=gray>/S_RFF/C_C506/<font color=green><b>D_1153</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=DM)), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG1</b><font color=gray>/S_RFF/C_C506/<font color=green><b>D_1154</b><font color=black>, keepss=true);
 a$56.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG1</b><font color=black>;
 a$72=AStructureNode.createNode(1, "BELNR",a$56,0,1,null,0); a$3.addChildElement(a$72); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/D_3035]
 
 a$46 = new NodeArgWrapper(16, storage); 
//= const 
ms$98=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "DP;SU;BY");
 
//= createIfHasOneOfSuchValues 
ms$99=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$99, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$99); a$58.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/<font color=maroon><b>M_INVOIC</b><font color=gray>/G_SG2/S_NAD/<font color=green><b>D_3035</b><font color=black>;
 a$58.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=DP;SU;BY);
 a$3=AStructureNode.createNode(1, "E1EDKA1",a$58,0,99,null,45); a$2.addChildElement(a$3); 
//= const 
ms$100=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "1");
 a$101=AStructureNode.createNode(3, "SEGMENT",a$46,1,1,null,0); a$3.addChildElement(a$101); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/D_3035]
 
 a$1 = new NodeArgWrapper(17, storage); 
//= FixValues 
ms$102=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$53 = new FunctionWrapper(ms$102, this);mt$prepareFunc(a$53,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$102); a$53.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/<font color=green><b>D_3035</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("DP","WE");
 a$103.setProperty("SU","LF");
 a$103.setProperty("BY","AG");
 FixedValuesTable mt$fvt$=new FixedValuesTable(a$103);
 
a$53.setParameter("table", mt$fvt$);
 
a$53.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$53.setParameter("vmdefault", "");
 a$101=AStructureNode.createNode(1, "PARVW",a$53,0,1,null,0); a$3.addChildElement(a$101); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/D_3035]
 
 a$46 = new NodeArgWrapper(18, storage); 
//= const 
ms$104=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "BY");
 
//= hasOneOfSuchValues 
ms$105=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$48 = new FunctionWrapper(ms$105, this);mt$prepareFunc(a$48,libs.UDFUtilsPool, "hasOneOfSuchValues", ms$105); a$48.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG2</b><font color=gray>/S_NAD/<font color=green><b>D_3035</b><font color=black>;
 a$48.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=BY);
 
//= not 
ms$106=new MethodSignature(new Class[]{String.class}, new String[]{null}); 
a$51 = new FunctionWrapper(ms$106, this);mt$prepareFunc(a$51,"com.sap.aii.mappingtool.flib7.Bool", "not", ms$106); a$51.setArgument(0,a$48);//<html><body><font color=#808000><b>hasOneOfSuchValues</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG2</b><font color=gray>/S_NAD/<font color=green><b>D_3035</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=BY));
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG2/S_NAD/C_C082/D_3039]
 
 a$46 = new NodeArgWrapper(19, storage); 
//= ifWithoutElse 
ms$107=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$1 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$1.setArgument(0,a$51);//<html><body><font color=#808000><b>not</b></font>(<html><body><font color=#808000><b>hasOneOfSuchValues</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG2</b><font color=gray>/S_NAD/<font color=green><b>D_3035</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=BY)));
 a$1.setArgument(1,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG2</b><font color=gray>/S_NAD/C_C082/<font color=green><b>D_3039</b><font color=black>;
 
a$1.setParameter("keepss", new KeepSuppresses(true));
 a$101=AStructureNode.createNode(1, "PARTN",a$1,0,1,null,0); a$3.addChildElement(a$101); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1153]
 
 a$46 = new NodeArgWrapper(20, storage); 
//= const 
ms$149=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "ON");
 
//= createIfHasOneOfSuchValues 
ms$150=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$150, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$150); a$58.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/<font color=maroon><b>M_INVOIC</b><font color=gray>/G_SG1/S_RFF/C_C506/<font color=green><b>D_1153</b><font color=black>;
 a$58.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=ON);
 a$3=AStructureNode.createNode(1, "E1EDK02",a$58,0,20,null,6); a$2.addChildElement(a$3); 
//= const 
ms$151=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "1");
 a$152=AStructureNode.createNode(3, "SEGMENT",a$46,1,1,null,0); a$3.addChildElement(a$152); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1153]
 
 a$1 = new NodeArgWrapper(21, storage); 
//= FixValues 
ms$153=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$53 = new FunctionWrapper(ms$153, this);mt$prepareFunc(a$53,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$153); a$53.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG1</b><font color=gray>/S_RFF/C_C506/<font color=green><b>D_1153</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("ON","001");
 FixedValuesTable mt$fvt$154=new FixedValuesTable(a$103);
 
a$53.setParameter("table", mt$fvt$154);
 
a$53.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$53.setParameter("vmdefault", "");
 a$152=AStructureNode.createNode(1, "QUALF",a$53,0,1,null,0); a$3.addChildElement(a$152); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1/S_RFF/C_C506/D_1154]
 
 a$46 = new NodeArgWrapper(22, storage); a$152=AStructureNode.createNode(1, "BELNR",a$46,0,1,null,0); a$3.addChildElement(a$152); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG1/S_DTM/C_C507/D_2380]
 
 a$1 = new NodeArgWrapper(23, storage); a$155=AStructureNode.createNode(1, "DATUM",a$1,0,1,null,0); a$3.addChildElement(a$155); 
//Src[/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2005]
 
 a$46 = new NodeArgWrapper(24, storage); 
//= const 
ms$156=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "3;35;137");
 
//= createIfHasOneOfSuchValues 
ms$157=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$157, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$157); a$58.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/<font color=maroon><b>M_INVOIC</b><font color=gray>/S_DTM/C_C507/<font color=green><b>D_2005</b><font color=black>;
 a$58.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=3;35;137);
 a$3=AStructureNode.createNode(1, "E1EDK03",a$58,0,20,null,4); a$2.addChildElement(a$3); 
//= const 
ms$158=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "1");
 a$159=AStructureNode.createNode(3, "SEGMENT",a$46,1,1,null,0); a$3.addChildElement(a$159); 
//Src[/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2005]
 
 a$1 = new NodeArgWrapper(25, storage); 
//= FixValues 
ms$160=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$48 = new FunctionWrapper(ms$160, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$160); a$48.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>S_DTM</b><font color=gray>/C_C507/<font color=green><b>D_2005</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("3","016");
 a$103.setProperty("35","001");
 a$103.setProperty("137","012");
 FixedValuesTable mt$fvt$161=new FixedValuesTable(a$103);
 
a$48.setParameter("table", mt$fvt$161);
 
a$48.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$48.setParameter("vmdefault", "");
 a$159=AStructureNode.createNode(1, "IDDAT",a$48,0,1,null,0); a$3.addChildElement(a$159); 
//Src[/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2380]
 
 a$46 = new NodeArgWrapper(26, storage); 
//Src[/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2379]
 
 a$1 = new NodeArgWrapper(27, storage); 
//= constantDate 
ms$162=new MethodSignature(new Class[]{}, new String[]{}); 
a$51 = new FunctionWrapper(ms$162, this);mt$prepareFunc(a$51,libs.UDFDateTimePool, "constantDate", ms$162); 
//= getDate 
ms$163=new MethodSignature(new Class[]{String[].class, String[].class, String[].class, ResultList.class}, new String[]{null, null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$163, this);mt$prepareFunc(a$58,libs.UDFDateTimePool, "getDate", ms$163); a$58.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>S_DTM</b><font color=gray>/C_C507/<font color=green><b>D_2380</b><font color=black>;
 a$58.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>S_DTM</b><font color=gray>/C_C507/<font color=green><b>D_2379</b><font color=black>;
 a$58.setArgument(2,a$51);//<html><body><font color=#808000><b>constantDate</b></font>();
 a$159=AStructureNode.createNode(1, "DATUM",a$58,0,1,null,0); a$3.addChildElement(a$159); 
//Src[/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2380]
 
 a$46 = new NodeArgWrapper(28, storage); 
//Src[/ns0:INVOIC96A/M_INVOIC/S_DTM/C_C507/D_2379]
 
 a$1 = new NodeArgWrapper(29, storage); 
//= const 
ms$164=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "false");
 
//= getTime 
ms$166=new MethodSignature(new Class[]{String[].class, String[].class, String[].class, ResultList.class}, new String[]{null, null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$166, this);mt$prepareFunc(a$58,libs.UDFDateTimePool, "getTime", ms$166); a$58.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>S_DTM</b><font color=gray>/C_C507/<font color=green><b>D_2380</b><font color=black>;
 a$58.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>S_DTM</b><font color=gray>/C_C507/<font color=green><b>D_2379</b><font color=black>;
 a$58.setArgument(2,a$165);//<html><body><font color=#808000><b>const</b></font>(value=false);
 a$159=AStructureNode.createNode(1, "UZEIT",a$58,0,1,null,0); a$3.addChildElement(a$159); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15/S_ALC/D_5463]
 
 a$46 = new NodeArgWrapper(30, storage); 
//= collapseContexts 
ms$167=new MethodSignature(new Class[]{String.class}, new String[]{null}); 
a$1 = new com.sap.aii.mappingtool.flib7.CollapseContexts(this); a$1.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG15</b><font color=gray>/S_ALC/<font color=green><b>D_5463</b><font color=black>;
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15]
 
 a$165 = new NodeArgWrapper(31, storage); 
//= formatByExample 
ms$168=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$168, this);mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$168); a$56.setArgument(0,a$1);//<html><body><font color=#808000><b>collapseContexts</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG15</b><font color=gray>/S_ALC/<font color=green><b>D_5463</b><font color=black>);
 a$56.setArgument(1,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG15</b><font color=black>;
 
//= const 
ms$169=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "A;C");
 
//= createIfHasOneOfSuchValues 
ms$170=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$170, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$170); a$58.setArgument(0,a$56);//<html><body><font color=#808000><b>formatByExample</b></font>(<html><body><font color=#808000><b>collapseContexts</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG15</b><font color=gray>/S_ALC/<font color=green><b>D_5463</b><font color=black>), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=green><b>G_SG15</b><font color=black>, result);

  __CreateStructures0();}
  private void __CreateStructures0(){  a$58.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=A;C);
 a$159=AStructureNode.createNode(1, "E1EDK05",a$58,0,99,null,13); a$2.addChildElement(a$159); 
//= const 
ms$171=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$3=AStructureNode.createNode(3, "SEGMENT",a$1,1,1,null,0); a$159.addChildElement(a$3); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15/S_ALC/D_5463]
 
 a$165 = new NodeArgWrapper(32, storage); 
//= FixValues 
ms$172=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$53 = new FunctionWrapper(ms$172, this);mt$prepareFunc(a$53,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$172); a$53.setArgument(0,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG15</b><font color=gray>/S_ALC/<font color=green><b>D_5463</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("A","+");
 a$103.setProperty("C","-");
 FixedValuesTable mt$fvt$173=new FixedValuesTable(a$103);
 
a$53.setParameter("table", mt$fvt$173);
 
a$53.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$53.setParameter("vmdefault", "");
 a$3=AStructureNode.createNode(1, "ALCKZ",a$53,0,1,null,0); a$159.addChildElement(a$3); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15/S_ALC/C_C214/D_7161]
 
 a$46 = new NodeArgWrapper(33, storage); a$3=AStructureNode.createNode(1, "KSCHL",a$46,0,1,null,0); a$159.addChildElement(a$3); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19/S_MOA/C_C516/D_5025]
 
 a$1 = new NodeArgWrapper(34, storage); 
//= const 
ms$174=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "8");
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19/S_MOA/C_C516/D_5004]
 
 a$46 = new NodeArgWrapper(35, storage); 
//= assignValueByCondition 
ms$175=new MethodSignature(new Class[]{String[].class, String[].class, String[].class, ResultList.class}, new String[]{null, null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$175, this);mt$prepareFunc(a$58,libs.UDFNodePool, "assignValueByCondition", ms$175); a$58.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG15/<font color=maroon><b>G_SG19</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>;
 a$58.setArgument(1,a$165);//<html><body><font color=#808000><b>const</b></font>(value=8);
 a$58.setArgument(2,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG15/<font color=maroon><b>G_SG19</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5004</b><font color=black>;
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG15/G_SG19]
 
 a$1 = new NodeArgWrapper(36, storage); 
//= formatByExample 
ms$176=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$176, this);mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$176); a$56.setArgument(0,a$58);//<html><body><font color=#808000><b>assignValueByCondition</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG15/<font color=maroon><b>G_SG19</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=8), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG15/<font color=maroon><b>G_SG19</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5004</b><font color=black>, result);
 a$56.setArgument(1,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG15/<font color=green><b>G_SG19</b><font color=black>;
 a$177=AStructureNode.createNode(1, "BETRG",a$56,0,1,null,0); a$159.addChildElement(a$177); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG50/S_TAX/D_5283]
 
 a$165 = new NodeArgWrapper(37, storage); 
//= const 
ms$185=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "7");
 
//= createIfHasOneOfSuchValues 
ms$186=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$186, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$186); a$58.setArgument(0,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/<font color=maroon><b>M_INVOIC</b><font color=gray>/G_SG50/S_TAX/<font color=green><b>D_5283</b><font color=black>;
 a$58.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=7);
 a$159=AStructureNode.createNode(1, "E1EDK04",a$58,0,999,null,6); a$2.addChildElement(a$159); 
//= const 
ms$187=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$188=AStructureNode.createNode(3, "SEGMENT",a$1,1,1,null,0); a$159.addChildElement(a$188); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG50/S_TAX/C_C241/D_5153]
 
 a$165 = new NodeArgWrapper(38, storage); a$188=AStructureNode.createNode(1, "MWSKZ",a$165,0,1,null,0); a$159.addChildElement(a$188); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG50/S_TAX/C_C243/D_5278]
 
 a$46 = new NodeArgWrapper(39, storage); a$188=AStructureNode.createNode(1, "MSATZ",a$46,0,1,null,0); a$159.addChildElement(a$188); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG50/S_MOA/C_C516/D_5025]
 
 a$1 = new NodeArgWrapper(40, storage); 
//= const 
ms$189=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "150");
 
//= stringEquals 
ms$190=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$48 = new FunctionWrapper(ms$190, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.TextFunctions", "equalsString", ms$190); a$48.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG50</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>;
 a$48.setArgument(1,a$165);//<html><body><font color=#808000><b>const</b></font>(value=150);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG50/S_MOA/C_C516/D_5004]
 
 a$46 = new NodeArgWrapper(41, storage); 
//= ifWithoutElse 
ms$191=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$1 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$1.setArgument(0,a$48);//<html><body><font color=#808000><b>stringEquals</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG50</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=150));
 a$1.setArgument(1,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG50</b><font color=gray>/S_MOA/C_C516/<font color=green><b>D_5004</b><font color=black>;
 
a$1.setParameter("keepss", new KeepSuppresses(true));
 a$188=AStructureNode.createNode(1, "MWSBT",a$1,0,1,null,0); a$159.addChildElement(a$188); 
//= const 
ms$198=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "");
 a$199=AStructureNode.createNode(1, "E1EDK14",a$165,0,10,null,3); a$2.addChildElement(a$199); 
//= const 
ms$200=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "1");
 a$201=AStructureNode.createNode(3, "SEGMENT",a$46,1,1,null,0); a$199.addChildElement(a$201); 
//= const 
ms$202=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "011");
 a$201=AStructureNode.createNode(1, "QUALF",a$1,0,1,null,0); a$199.addChildElement(a$201); 
//= const 
ms$203=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "Buchungskreis");
 a$201=AStructureNode.createNode(1, "ORGID",a$165,0,1,null,0); a$199.addChildElement(a$201); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25]
 
 a$46 = new NodeArgWrapper(42, storage); a$201=AStructureNode.createNode(1, "E1EDP01",a$46,0,999999,null,65); a$2.addChildElement(a$201); 
//= const 
ms$204=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$199=AStructureNode.createNode(3, "SEGMENT",a$1,1,1,null,0); a$201.addChildElement(a$199); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/D_1082]
 
 a$165 = new NodeArgWrapper(43, storage); a$199=AStructureNode.createNode(1, "POSEX",a$165,0,1,null,0); a$201.addChildElement(a$199); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6063]
 
 a$46 = new NodeArgWrapper(44, storage); 
//= const 
ms$207=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "47;100");
 
//= hasOneOfSuchValues 
ms$208=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$51 = new FunctionWrapper(ms$208, this);mt$prepareFunc(a$51,libs.UDFUtilsPool, "hasOneOfSuchValues", ms$208); a$51.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_QTY/C_C186/<font color=green><b>D_6063</b><font color=black>;
 a$51.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=47;100);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6060]
 
 a$165 = new NodeArgWrapper(45, storage); 
//= ifWithoutElse 
ms$209=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$46 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$46.setArgument(0,a$51);//<html><body><font color=#808000><b>hasOneOfSuchValues</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_QTY/C_C186/<font color=green><b>D_6063</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=47;100));
 a$46.setArgument(1,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_QTY/C_C186/<font color=green><b>D_6060</b><font color=black>;
 
a$46.setParameter("keepss", new KeepSuppresses(false));
 a$210=AStructureNode.createNode(1, "MENGE",a$46,0,1,null,0); a$201.addChildElement(a$210); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6063]
 
 a$1 = new NodeArgWrapper(46, storage); 
//= const 
ms$211=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "47;100");
 
//= hasOneOfSuchValues 
ms$212=new MethodSignature(new Class[]{String.class, String.class}, new String[]{null, null}); 
a$53 = new FunctionWrapper(ms$212, this);mt$prepareFunc(a$53,libs.UDFUtilsPool, "hasOneOfSuchValues", ms$212); a$53.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_QTY/C_C186/<font color=green><b>D_6063</b><font color=black>;
 a$53.setArgument(1,a$165);//<html><body><font color=#808000><b>const</b></font>(value=47;100);
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY/C_C186/D_6411]
 
 a$46 = new NodeArgWrapper(47, storage); 
//= collapseContexts 
ms$213=new MethodSignature(new Class[]{String.class}, new String[]{null}); 
a$1 = new com.sap.aii.mappingtool.flib7.CollapseContexts(this); a$1.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/<font color=maroon><b>S_QTY</b><font color=gray>/C_C186/<font color=green><b>D_6411</b><font color=black>;
 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_QTY]
 
 a$165 = new NodeArgWrapper(48, storage); 
//= formatByExample 
ms$214=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$56 = new Q2QFunctionWrapper(ms$214, this);mt$prepareFunc(a$56,"com.sap.aii.mappingtool.flib7.NodeFunctions", "formatByExample", ms$214); a$56.setArgument(0,a$1);//<html><body><font color=#808000><b>collapseContexts</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/<font color=maroon><b>S_QTY</b><font color=gray>/C_C186/<font color=green><b>D_6411</b><font color=black>);
 a$56.setArgument(1,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/<font color=green><b>S_QTY</b><font color=black>;
 
//= ifWithoutElse 
ms$215=new MethodSignature(new Class[]{String.class, String.class, KeepSuppresses.class}, new String[]{null, null, "keepss"}); 
a$46 = new com.sap.aii.mappingtool.flib7.IfWithoutElse(this); a$46.setArgument(0,a$53);//<html><body><font color=#808000><b>hasOneOfSuchValues</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_QTY/C_C186/<font color=green><b>D_6063</b><font color=black>, <html><body><font color=#808000><b>const</b></font>(value=47;100));
 a$46.setArgument(1,a$56);//<html><body><font color=#808000><b>formatByExample</b></font>(<html><body><font color=#808000><b>collapseContexts</b></font>(<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/<font color=maroon><b>S_QTY</b><font color=gray>/C_C186/<font color=green><b>D_6411</b><font color=black>), <html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/<font color=green><b>S_QTY</b><font color=black>, result);
 
a$46.setParameter("keepss", new KeepSuppresses(false));
 a$210=AStructureNode.createNode(1, "MENEE",a$46,0,1,null,0); a$201.addChildElement(a$210); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/C_C212/D_7143]
 
 a$1 = new NodeArgWrapper(49, storage); 
//= const 
ms$263=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "EN;BP;SA");
 
//= createIfHasOneOfSuchValues 
ms$264=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$264, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$264); a$58.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_LIN/C_C212/<font color=green><b>D_7143</b><font color=black>;
 a$58.setArgument(1,a$165);//<html><body><font color=#808000><b>const</b></font>(value=EN;BP;SA);
 a$265=AStructureNode.createNode(1, "E1EDP19",a$58,0,10,null,9); a$201.addChildElement(a$265); 
//= const 
ms$266=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "1");
 a$267=AStructureNode.createNode(3, "SEGMENT",a$46,1,1,null,0); a$265.addChildElement(a$267); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/C_C212/D_7143]
 
 a$1 = new NodeArgWrapper(50, storage); 
//= FixValues 
ms$268=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$48 = new FunctionWrapper(ms$268, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$268); a$48.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_LIN/C_C212/<font color=green><b>D_7143</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("SA","002");
 a$103.setProperty("EN","003");
 a$103.setProperty("BP","001");
 FixedValuesTable mt$fvt$269=new FixedValuesTable(a$103);
 
a$48.setParameter("table", mt$fvt$269);
 
a$48.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$48.setParameter("vmdefault", "");
 a$267=AStructureNode.createNode(1, "QUALF",a$48,0,1,null,0); a$265.addChildElement(a$267); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_LIN/C_C212/D_7140]
 
 a$165 = new NodeArgWrapper(51, storage); a$267=AStructureNode.createNode(1, "IDTNR",a$165,0,1,null,0); a$265.addChildElement(a$267); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA/C_C212_1/D_7143]
 
 a$46 = new NodeArgWrapper(52, storage); 
//= const 
ms$275=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "BP;SA;EN");
 
//= createIfHasOneOfSuchValues 
ms$276=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$276, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$276); a$58.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/S_PIA/C_C212_1/<font color=green><b>D_7143</b><font color=black>;
 a$58.setArgument(1,a$1);//<html><body><font color=#808000><b>const</b></font>(value=BP;SA;EN);
 a$277=AStructureNode.createNode(1, "E1EDP19",a$58,0,10,null,9); a$201.addChildElement(a$277); 
//= const 
ms$278=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "1");
 a$279=AStructureNode.createNode(3, "SEGMENT",a$165,1,1,null,0); a$277.addChildElement(a$279); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA/C_C212_1/D_7143]
 
 a$46 = new NodeArgWrapper(53, storage); 
//= FixValues 
ms$280=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$51 = new FunctionWrapper(ms$280, this);mt$prepareFunc(a$51,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$280); a$51.setArgument(0,a$46);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/<font color=maroon><b>S_PIA</b><font color=gray>/C_C212_1/<font color=green><b>D_7143</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("SA","002");
 a$103.setProperty("EN","003");
 a$103.setProperty("BP","001");
 FixedValuesTable mt$fvt$281=new FixedValuesTable(a$103);
 
a$51.setParameter("table", mt$fvt$281);
 
a$51.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$51.setParameter("vmdefault", "");
 a$279=AStructureNode.createNode(1, "QUALF",a$51,0,1,null,0); a$277.addChildElement(a$279); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/S_PIA/C_C212_1/D_7140]
 
 a$1 = new NodeArgWrapper(54, storage); a$279=AStructureNode.createNode(1, "IDTNR",a$1,0,1,null,0); a$277.addChildElement(a$279); a$265.setNextDuplicated(a$277); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/D_5025]
 
 a$165 = new NodeArgWrapper(55, storage); 
//= const 
ms$287=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "125;203");
 
//= createIfHasOneOfSuchValues 
ms$288=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$288, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$288); a$58.setArgument(0,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/<font color=maroon><b>G_SG25</b><font color=gray>/G_SG26/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>;
 a$58.setArgument(1,a$46);//<html><body><font color=#808000><b>const</b></font>(value=125;203);
 a$289=AStructureNode.createNode(1, "E1EDP26",a$58,0,20,null,3); a$201.addChildElement(a$289); 
//= const 
ms$290=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$1 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$1.setParameter("value", "1");
 a$291=AStructureNode.createNode(3, "SEGMENT",a$1,1,1,null,0); a$289.addChildElement(a$291); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/D_5025]
 
 a$165 = new NodeArgWrapper(56, storage); 
//= FixValues 
ms$292=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$53 = new FunctionWrapper(ms$292, this);mt$prepareFunc(a$53,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$292); a$53.setArgument(0,a$165);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("125","003");
 a$103.setProperty("203","003");
 FixedValuesTable mt$fvt$293=new FixedValuesTable(a$103);
 
a$53.setParameter("table", mt$fvt$293);
 
a$53.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$53.setParameter("vmdefault", "");
 a$291=AStructureNode.createNode(1, "QUALF",a$53,0,1,null,0); a$289.addChildElement(a$291); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG25/G_SG26/S_MOA/C_C516/D_5004]
 
 a$46 = new NodeArgWrapper(57, storage); a$291=AStructureNode.createNode(1, "BETRG",a$46,0,1,null,0); a$289.addChildElement(a$291); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/D_5025]
 
 a$1 = new NodeArgWrapper(58, storage); 
//= const 
ms$299=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$165 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$165.setParameter("value", "77");
 
//= createIfHasOneOfSuchValues 
ms$300=new MethodSignature(new Class[]{String[].class, String[].class, ResultList.class}, new String[]{null, null, null}); 
a$58 = new C2CFunctionWrapper(ms$300, this);mt$prepareFunc(a$58,libs.UDFNodePool, "createIfHasOneOfSuchValues", ms$300); a$58.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/<font color=maroon><b>M_INVOIC</b><font color=gray>/G_SG48/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>;
 a$58.setArgument(1,a$165);//<html><body><font color=#808000><b>const</b></font>(value=77);
 a$201=AStructureNode.createNode(1, "E1EDS01",a$58,0,30,null,5); a$2.addChildElement(a$201); 
//= const 
ms$301=new MethodSignature(new Class[]{String.class}, new String[]{"value"}); 
a$46 = new com.sap.aii.mappingtool.flib7.Constant(this); 
a$46.setParameter("value", "1");
 a$302=AStructureNode.createNode(3, "SEGMENT",a$46,1,1,null,0); a$201.addChildElement(a$302); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/D_5025]
 
 a$1 = new NodeArgWrapper(59, storage); 
//= FixValues 
ms$303=new MethodSignature(new Class[]{String.class, FixedValuesTable.class, ValueMappingStrategy.class, String.class}, new String[]{null, "table", "vmstrategy", "vmdefault"}); 
a$48 = new FunctionWrapper(ms$303, this);mt$prepareFunc(a$48,"com.sap.aii.mappingtool.flib7.TextFunctions", "fixed_values", ms$303); a$48.setArgument(0,a$1);//<html><body><font color=gray>/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/<font color=green><b>D_5025</b><font color=black>;
 a$103 = new Properties();
 a$103.setProperty("77","008");
 FixedValuesTable mt$fvt$304=new FixedValuesTable(a$103);
 
a$48.setParameter("table", mt$fvt$304);
 
a$48.setParameter("vmstrategy", ValueMappingStrategy.USE_DEFAULT);
 
a$48.setParameter("vmdefault", "");
 a$302=AStructureNode.createNode(1, "SUMID",a$48,0,1,null,0); a$201.addChildElement(a$302); 
//Src[/ns0:INVOIC96A/M_INVOIC/G_SG48/S_MOA/C_C516/D_5004]
 
 a$165 = new NodeArgWrapper(60, storage); a$302=AStructureNode.createNode(1, "SUMME",a$165,0,1,null,0); a$201.addChildElement(a$302);}
   
   public Map getUriMappings(){
     Map uris=new HashMap();
    uris.put("http://sap.com/xi/B2B/Examples/EDIFACT","ns0");
    if (uris.isEmpty())
    return Collections.EMPTY_MAP; else return uris;
  }
  public void preStart() throws StreamTransformationException {
    params.assignVars();
    libs.libsinit();
    super.preStart();
  }
  public void postStart() throws StreamTransformationException {
    libs.libscleanup();
    super.postStart();
  }
  

  public void init(GlobalContainer container) throws StreamTransformationException{
  // beginning of init f2bfdf97b7d432d057584464aabdb643

  // end of init f2bfdf97b7d432d057584464aabdb643
  }


  public void cleanUp(GlobalContainer container) throws StreamTransformationException{
  // beginning of cleanUp 7e26d344ee3a9ad7648ebff5b3eb584b
  
  // end of cleanUp 7e26d344ee3a9ad7648ebff5b3eb584b
  }
// beginning of attributes and methods 72418d956989a1e71aecbea9d5a90ecf

// end of attributes and methods 72418d956989a1e71aecbea9d5a90ecf


  
  private class MT$InnerLibsList{
         private sap.com.UDFNodePool UDFNodePool = new sap.com.UDFNodePool();
   private sap.com.UDFUtilsPool UDFUtilsPool = new sap.com.UDFUtilsPool();
   private sap.com.UDFDateTimePool UDFDateTimePool = new sap.com.UDFDateTimePool();

      private MT$InnerLibsList(){
        
      }
      private void libsinit() throws StreamTransformationException {
        init(getGlobalContainer());
UDFNodePool.init(getGlobalContainer());
UDFUtilsPool.init(getGlobalContainer());
UDFDateTimePool.init(getGlobalContainer());

      }
      private void libscleanup() throws StreamTransformationException {
        cleanUp(getGlobalContainer());
UDFNodePool.cleanUp(getGlobalContainer());
UDFUtilsPool.cleanUp(getGlobalContainer());
UDFDateTimePool.cleanUp(getGlobalContainer());

      }
  }
  private class MT$InnerParamsList{
      
      private MT$InnerParamsList(){
      }
      private void assignVars(){
       
      }
  }
  public static void main(String[] args) throws Exception{/*!_$ClNRep_*/_MM_INVOIC96A_TO_INVOIC02_ st = new /*!_$ClNRep_*/_MM_INVOIC96A_TO_INVOIC02_(); st.testExecute(); }
}
