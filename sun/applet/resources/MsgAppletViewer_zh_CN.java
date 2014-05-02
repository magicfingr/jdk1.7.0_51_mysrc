/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.applet.resources;

import java.util.ListResourceBundle;

public class MsgAppletViewer_zh_CN extends ListResourceBundle {

    public Object[][] getContents() {
        Object[][] temp = new Object[][] {
            {"textframe.button.dismiss", "\u5173\u95ED"},
            {"appletviewer.tool.title", "\u5C0F\u5E94\u7528\u7A0B\u5E8F\u67E5\u770B\u5668: {0}"},
            {"appletviewer.menu.applet", "\u5C0F\u5E94\u7528\u7A0B\u5E8F"},
            {"appletviewer.menuitem.restart", "\u91CD\u65B0\u542F\u52A8"},
            {"appletviewer.menuitem.reload", "\u91CD\u65B0\u52A0\u8F7D"},
            {"appletviewer.menuitem.stop", "\u505C\u6B62"},
            {"appletviewer.menuitem.save", "\u4FDD\u5B58..."},
            {"appletviewer.menuitem.start", "\u542F\u52A8"},
            {"appletviewer.menuitem.clone", "\u514B\u9686..."},
            {"appletviewer.menuitem.tag", "\u6807\u8BB0..."},
            {"appletviewer.menuitem.info", "\u4FE1\u606F..."},
            {"appletviewer.menuitem.edit", "\u7F16\u8F91"},
            {"appletviewer.menuitem.encoding", "\u5B57\u7B26\u7F16\u7801"},
            {"appletviewer.menuitem.print", "\u6253\u5370..."},
            {"appletviewer.menuitem.props", "\u5C5E\u6027..."},
            {"appletviewer.menuitem.close", "\u5173\u95ED"},
            {"appletviewer.menuitem.quit", "\u9000\u51FA"},
            {"appletviewer.label.hello", "\u60A8\u597D..."},
            {"appletviewer.status.start", "\u6B63\u5728\u542F\u52A8\u5C0F\u5E94\u7528\u7A0B\u5E8F..."},
            {"appletviewer.appletsave.filedialogtitle","\u5C06\u5C0F\u5E94\u7528\u7A0B\u5E8F\u5E8F\u5217\u5316\u4E3A\u6587\u4EF6"},
            {"appletviewer.appletsave.err1", "\u5C06{0}\u5E8F\u5217\u5316\u4E3A{1}"},
            {"appletviewer.appletsave.err2", "\u5728 appletSave \u4E2D: {0}"},
            {"appletviewer.applettag", "\u663E\u793A\u7684\u6807\u8BB0"},
            {"appletviewer.applettag.textframe", "\u5C0F\u5E94\u7528\u7A0B\u5E8F HTML \u6807\u8BB0"},
            {"appletviewer.appletinfo.applet", "-- \u6CA1\u6709\u5C0F\u5E94\u7528\u7A0B\u5E8F\u4FE1\u606F --"},
            {"appletviewer.appletinfo.param", "-- \u6CA1\u6709\u53C2\u6570\u4FE1\u606F --"},
            {"appletviewer.appletinfo.textframe", "\u5C0F\u5E94\u7528\u7A0B\u5E8F\u4FE1\u606F"},
            {"appletviewer.appletprint.fail", "\u6253\u5370\u5931\u8D25\u3002"},
            {"appletviewer.appletprint.finish", "\u5DF2\u5B8C\u6210\u6253\u5370\u3002"},
            {"appletviewer.appletprint.cancel", "\u6253\u5370\u5DF2\u53D6\u6D88\u3002"},
            {"appletviewer.appletencoding", "\u5B57\u7B26\u7F16\u7801: {0}"},
            {"appletviewer.parse.warning.requiresname", "\u8B66\u544A: <param name=... value=...> \u6807\u8BB0\u9700\u8981\u540D\u79F0\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.paramoutside", "\u8B66\u544A: <param> \u6807\u8BB0\u5728 <applet> ... </applet> \u5916\u90E8\u3002"},
            {"appletviewer.parse.warning.applet.requirescode", "\u8B66\u544A: <applet> \u6807\u8BB0\u9700\u8981\u4EE3\u7801\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.applet.requiresheight", "\u8B66\u544A: <applet> \u6807\u8BB0\u9700\u8981\u9AD8\u5EA6\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.applet.requireswidth", "\u8B66\u544A: <applet> \u6807\u8BB0\u9700\u8981\u5BBD\u5EA6\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.object.requirescode", "\u8B66\u544A: <object> \u6807\u8BB0\u9700\u8981\u4EE3\u7801\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.object.requiresheight", "\u8B66\u544A: <object> \u6807\u8BB0\u9700\u8981\u9AD8\u5EA6\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.object.requireswidth", "\u8B66\u544A: <object> \u6807\u8BB0\u9700\u8981\u5BBD\u5EA6\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.embed.requirescode", "\u8B66\u544A: <embed> \u6807\u8BB0\u9700\u8981\u4EE3\u7801\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.embed.requiresheight", "\u8B66\u544A: <embed> \u6807\u8BB0\u9700\u8981\u9AD8\u5EA6\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.embed.requireswidth", "\u8B66\u544A: <embed> \u6807\u8BB0\u9700\u8981\u5BBD\u5EA6\u5C5E\u6027\u3002"},
            {"appletviewer.parse.warning.appnotLongersupported", "\u8B66\u544A: \u4E0D\u518D\u652F\u6301 <app> \u6807\u8BB0, \u8BF7\u6539\u7528 <applet>:"},
            {"appletviewer.usage", "\u7528\u6CD5: appletviewer <options> url\n\n\u5176\u4E2D, <options> \u5305\u62EC:\n  -debug                  \u5728 Java \u8C03\u8BD5\u5668\u4E2D\u542F\u52A8\u5C0F\u5E94\u7528\u7A0B\u5E8F\u67E5\u770B\u5668\n  -encoding <encoding>    \u6307\u5B9A HTML \u6587\u4EF6\u4F7F\u7528\u7684\u5B57\u7B26\u7F16\u7801\n  -J<runtime flag>        \u5C06\u53C2\u6570\u4F20\u9012\u5230 java \u89E3\u91CA\u5668\n\n-J \u9009\u9879\u662F\u975E\u6807\u51C6\u9009\u9879, \u5982\u6709\u66F4\u6539, \u6055\u4E0D\u53E6\u884C\u901A\u77E5\u3002"},
            {"appletviewer.main.err.unsupportedopt", "\u4E0D\u652F\u6301\u7684\u9009\u9879: {0}"},
            {"appletviewer.main.err.unrecognizedarg", "\u65E0\u6CD5\u8BC6\u522B\u7684\u53C2\u6570: {0}"},
            {"appletviewer.main.err.dupoption", "\u91CD\u590D\u4F7F\u7528\u9009\u9879: {0}"},
            {"appletviewer.main.err.inputfile", "\u672A\u6307\u5B9A\u8F93\u5165\u6587\u4EF6\u3002"},
            {"appletviewer.main.err.badurl", "\u9519\u8BEF URL: {0} ({1})"},
            {"appletviewer.main.err.io", "\u8BFB\u53D6{0}\u65F6\u51FA\u73B0 I/O \u5F02\u5E38\u9519\u8BEF"},
            {"appletviewer.main.err.readablefile", "\u786E\u4FDD{0}\u662F\u6587\u4EF6\u4E14\u53EF\u8BFB\u3002"},
            {"appletviewer.main.err.correcturl", "{0} \u662F\u5426\u662F\u6B63\u786E\u7684 URL?"},
            {"appletviewer.main.prop.store", "AppletViewer \u7684\u7528\u6237\u7279\u5B9A\u5C5E\u6027"},
            {"appletviewer.main.err.prop.cantread", "\u65E0\u6CD5\u8BFB\u53D6\u7528\u6237\u5C5E\u6027\u6587\u4EF6: {0}"},
            {"appletviewer.main.err.prop.cantsave", "\u65E0\u6CD5\u4FDD\u5B58\u7528\u6237\u5C5E\u6027\u6587\u4EF6: {0}"},
            {"appletviewer.main.warn.nosecmgr", "\u8B66\u544A: \u7981\u7528\u5B89\u5168\u3002"},
            {"appletviewer.main.debug.cantfinddebug", "\u627E\u4E0D\u5230\u8C03\u8BD5\u5668!"},
            {"appletviewer.main.debug.cantfindmain", "\u5728\u8C03\u8BD5\u5668\u4E2D\u627E\u4E0D\u5230 main \u65B9\u6CD5!"},
            {"appletviewer.main.debug.exceptionindebug", "\u8C03\u8BD5\u5668\u4E2D\u5B58\u5728\u5F02\u5E38\u9519\u8BEF!"},
            {"appletviewer.main.debug.cantaccess", "\u65E0\u6CD5\u8BBF\u95EE\u8C03\u8BD5\u5668!"},
            {"appletviewer.main.nosecmgr", "\u8B66\u544A: \u672A\u5B89\u88C5 SecurityManager!"},
            {"appletviewer.main.warning", "\u8B66\u544A: \u672A\u542F\u52A8\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002\u786E\u4FDD\u8F93\u5165\u5305\u542B <applet> \u6807\u8BB0\u3002"},
            {"appletviewer.main.warn.prop.overwrite", "\u8B66\u544A: \u6839\u636E\u7528\u6237\u8BF7\u6C42\u4E34\u65F6\u8986\u76D6\u7CFB\u7EDF\u5C5E\u6027: \u5173\u952E\u5B57: {0}, \u65E7\u503C: {1}, \u65B0\u503C: {2}"},
            {"appletviewer.main.warn.cantreadprops", "\u8B66\u544A: \u65E0\u6CD5\u8BFB\u53D6 AppletViewer \u5C5E\u6027\u6587\u4EF6: {0}\u3002\u8BF7\u4F7F\u7528\u9ED8\u8BA4\u503C\u3002"},
            {"appletioexception.loadclass.throw.interrupted", "\u7C7B\u52A0\u8F7D\u4E2D\u65AD: {0}"},
            {"appletioexception.loadclass.throw.notloaded", "\u672A\u52A0\u8F7D\u7C7B: {0}"},
            {"appletclassloader.loadcode.verbose", "\u6253\u5F00\u5230{0}\u7684\u6D41\u4EE5\u83B7\u53D6{1}"},
            {"appletclassloader.filenotfound", "\u67E5\u627E\u65F6\u627E\u4E0D\u5230\u6587\u4EF6: {0}"},
            {"appletclassloader.fileformat", "\u52A0\u8F7D\u65F6\u51FA\u73B0\u6587\u4EF6\u683C\u5F0F\u5F02\u5E38\u9519\u8BEF: {0}"},
            {"appletclassloader.fileioexception", "\u52A0\u8F7D\u65F6\u51FA\u73B0 I/O \u5F02\u5E38\u9519\u8BEF: {0}"},
            {"appletclassloader.fileexception", "\u52A0\u8F7D\u65F6\u51FA\u73B0{0}\u5F02\u5E38\u9519\u8BEF: {1}"},
            {"appletclassloader.filedeath", "\u52A0\u8F7D\u65F6\u5DF2\u7EC8\u6B62{0}: {1}"},
            {"appletclassloader.fileerror", "\u52A0\u8F7D\u65F6\u51FA\u73B0{0}\u9519\u8BEF: {1}"},
            {"appletclassloader.findclass.verbose.openstream", "\u6253\u5F00\u5230{0}\u7684\u6D41\u4EE5\u83B7\u53D6{1}"},
            {"appletclassloader.getresource.verbose.forname", "\u540D\u79F0\u7684 AppletClassLoader.getResource: {0}"},
            {"appletclassloader.getresource.verbose.found", "\u5DF2\u627E\u5230\u4F5C\u4E3A\u7CFB\u7EDF\u8D44\u6E90\u7684\u8D44\u6E90{0}"},
            {"appletclassloader.getresourceasstream.verbose", "\u5DF2\u627E\u5230\u4F5C\u4E3A\u7CFB\u7EDF\u8D44\u6E90\u7684\u8D44\u6E90{0}"},
            {"appletpanel.runloader.err", "\u5BF9\u8C61\u6216\u4EE3\u7801\u53C2\u6570!"},
            {"appletpanel.runloader.exception", "\u53CD\u5E8F\u5217\u5316{0}\u65F6\u51FA\u73B0\u5F02\u5E38\u9519\u8BEF"},
            {"appletpanel.destroyed", "\u5DF2\u9500\u6BC1\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.loaded", "\u5DF2\u52A0\u8F7D\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.started", "\u5DF2\u542F\u52A8\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.inited", "\u5DF2\u521D\u59CB\u5316\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.stopped", "\u5DF2\u505C\u6B62\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.disposed", "\u5DF2\u5904\u7406\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.nocode", "APPLET \u6807\u8BB0\u7F3A\u5C11 CODE \u53C2\u6570\u3002"},
            {"appletpanel.notfound", "\u52A0\u8F7D: \u627E\u4E0D\u5230\u7C7B{0}\u3002"},
            {"appletpanel.nocreate", "\u52A0\u8F7D: \u65E0\u6CD5\u5B9E\u4F8B\u5316{0}\u3002"},
            {"appletpanel.noconstruct", "\u52A0\u8F7D: {0}\u4E0D\u662F\u516C\u5171\u7684, \u6216\u8005\u6CA1\u6709\u516C\u5171\u6784\u9020\u5668\u3002"},
            {"appletpanel.death", "\u5DF2\u7EC8\u6B62"},
            {"appletpanel.exception", "\u5F02\u5E38\u9519\u8BEF: {0}\u3002"},
            {"appletpanel.exception2", "\u5F02\u5E38\u9519\u8BEF: {0}: {1}\u3002"},
            {"appletpanel.error", "\u9519\u8BEF: {0}\u3002"},
            {"appletpanel.error2", "\u9519\u8BEF: {0}: {1}\u3002"},
            {"appletpanel.notloaded", "\u521D\u59CB\u5316: \u672A\u52A0\u8F7D\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.notinited", "\u542F\u52A8: \u672A\u521D\u59CB\u5316\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.notstarted", "\u505C\u6B62: \u672A\u542F\u52A8\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.notstopped", "\u9500\u6BC1: \u672A\u505C\u6B62\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.notdestroyed", "\u5904\u7406: \u672A\u9500\u6BC1\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.notdisposed", "\u52A0\u8F7D: \u672A\u5904\u7406\u5C0F\u5E94\u7528\u7A0B\u5E8F\u3002"},
            {"appletpanel.bail", "\u5DF2\u4E2D\u65AD: \u79BB\u5F00\u3002"},
            {"appletpanel.filenotfound", "\u67E5\u627E\u65F6\u627E\u4E0D\u5230\u6587\u4EF6: {0}"},
            {"appletpanel.fileformat", "\u52A0\u8F7D\u65F6\u51FA\u73B0\u6587\u4EF6\u683C\u5F0F\u5F02\u5E38\u9519\u8BEF: {0}"},
            {"appletpanel.fileioexception", "\u52A0\u8F7D\u65F6\u51FA\u73B0 I/O \u5F02\u5E38\u9519\u8BEF: {0}"},
            {"appletpanel.fileexception", "\u52A0\u8F7D\u65F6\u51FA\u73B0{0}\u5F02\u5E38\u9519\u8BEF: {1}"},
            {"appletpanel.filedeath", "\u52A0\u8F7D\u65F6\u5DF2\u7EC8\u6B62{0}: {1}"},
            {"appletpanel.fileerror", "\u52A0\u8F7D\u65F6\u51FA\u73B0{0}\u9519\u8BEF: {1}"},
            {"appletpanel.badattribute.exception", "HTML \u89E3\u6790: \u5BBD\u5EA6/\u9AD8\u5EA6\u5C5E\u6027\u7684\u503C\u4E0D\u6B63\u786E"},
            {"appletillegalargumentexception.objectinputstream", "AppletObjectInputStream \u9700\u8981\u975E\u7A7A\u52A0\u8F7D\u5668"},
            {"appletprops.title", "AppletViewer \u5C5E\u6027"},
            {"appletprops.label.http.server", "Http \u4EE3\u7406\u670D\u52A1\u5668:"},
            {"appletprops.label.http.proxy", "Http \u4EE3\u7406\u7AEF\u53E3:"},
            {"appletprops.label.network", "\u7F51\u7EDC\u8BBF\u95EE\u6743\u9650:"},
            {"appletprops.choice.network.item.none", "\u65E0"},
            {"appletprops.choice.network.item.applethost", "\u5C0F\u5E94\u7528\u7A0B\u5E8F\u4E3B\u673A"},
            {"appletprops.choice.network.item.unrestricted", "\u4E0D\u53D7\u9650\u5236"},
            {"appletprops.label.class", "\u7C7B\u8BBF\u95EE\u6743\u9650:"},
            {"appletprops.choice.class.item.restricted", "\u53D7\u9650\u5236"},
            {"appletprops.choice.class.item.unrestricted", "\u4E0D\u53D7\u9650\u5236"},
            {"appletprops.label.unsignedapplet", "\u5141\u8BB8\u672A\u7B7E\u540D\u5C0F\u5E94\u7528\u7A0B\u5E8F:"},
            {"appletprops.choice.unsignedapplet.no", "\u5426"},
            {"appletprops.choice.unsignedapplet.yes", "\u662F"},
            {"appletprops.button.apply", "\u5E94\u7528"},
            {"appletprops.button.cancel", "\u53D6\u6D88"},
            {"appletprops.button.reset", "\u91CD\u7F6E"},
            {"appletprops.apply.exception", "\u65E0\u6CD5\u4FDD\u5B58\u5C5E\u6027: {0}"},
            /* 4066432 */
            {"appletprops.title.invalidproxy", "\u6761\u76EE\u65E0\u6548"},
            {"appletprops.label.invalidproxy", "\u4EE3\u7406\u7AEF\u53E3\u5FC5\u987B\u662F\u4E00\u4E2A\u6B63\u6574\u6570\u503C\u3002"},
            {"appletprops.button.ok", "\u786E\u5B9A"},
            /* end 4066432 */
            {"appletprops.prop.store", "AppletViewer \u7684\u7528\u6237\u7279\u5B9A\u5C5E\u6027"},
            {"appletsecurityexception.checkcreateclassloader", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u7C7B\u52A0\u8F7D\u5668"},
            {"appletsecurityexception.checkaccess.thread", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u7EBF\u7A0B"},
            {"appletsecurityexception.checkaccess.threadgroup", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u7EBF\u7A0B\u7EC4: {0}"},
            {"appletsecurityexception.checkexit", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u9000\u51FA: {0}"},
            {"appletsecurityexception.checkexec", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u6267\u884C: {0}"},
            {"appletsecurityexception.checklink", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u94FE\u63A5: {0}"},
            {"appletsecurityexception.checkpropsaccess", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u5C5E\u6027"},
            {"appletsecurityexception.checkpropsaccess.key", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u5C5E\u6027\u8BBF\u95EE{0}"},
            {"appletsecurityexception.checkread.exception1", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: {0}, {1}"},
            {"appletsecurityexception.checkread.exception2", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: file.read: {0}"},
            {"appletsecurityexception.checkread", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: file.read: {0} == {1}"},
            {"appletsecurityexception.checkwrite.exception", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: {0}, {1}"},
            {"appletsecurityexception.checkwrite", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: file.write: {0} == {1}"},
            {"appletsecurityexception.checkread.fd", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: fd.read"},
            {"appletsecurityexception.checkwrite.fd", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: fd.write"},
            {"appletsecurityexception.checklisten", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: socket.listen: {0}"},
            {"appletsecurityexception.checkaccept", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: socket.accept: {0}:{1}"},
            {"appletsecurityexception.checkconnect.networknone", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: socket.connect: {0}->{1}"},
            {"appletsecurityexception.checkconnect.networkhost1", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u65E0\u6CD5\u8FDE\u63A5\u5230\u6E90\u81EA{1}\u7684{0}\u3002"},
            {"appletsecurityexception.checkconnect.networkhost2", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u65E0\u6CD5\u89E3\u6790\u4E3B\u673A{0}\u6216{1}\u7684 IP\u3002"},
            {"appletsecurityexception.checkconnect.networkhost3", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u65E0\u6CD5\u89E3\u6790\u4E3B\u673A{0}\u7684 IP\u3002\u8BF7\u53C2\u9605 trustProxy \u5C5E\u6027\u3002"},
            {"appletsecurityexception.checkconnect", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u8FDE\u63A5: {0}->{1}"},
            {"appletsecurityexception.checkpackageaccess", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u65E0\u6CD5\u8BBF\u95EE\u7A0B\u5E8F\u5305: {0}"},
            {"appletsecurityexception.checkpackagedefinition", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u65E0\u6CD5\u5B9A\u4E49\u7A0B\u5E8F\u5305: {0}"},
            {"appletsecurityexception.cannotsetfactory", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u65E0\u6CD5\u8BBE\u7F6E\u5DE5\u5382"},
            {"appletsecurityexception.checkmemberaccess", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u68C0\u67E5\u6210\u5458\u8BBF\u95EE\u6743\u9650"},
            {"appletsecurityexception.checkgetprintjob", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: getPrintJob"},
            {"appletsecurityexception.checksystemclipboardaccess", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: getSystemClipboard"},
            {"appletsecurityexception.checkawteventqueueaccess", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: getEventQueue"},
            {"appletsecurityexception.checksecurityaccess", "\u5B89\u5168\u5F02\u5E38\u9519\u8BEF: \u5B89\u5168\u64CD\u4F5C: {0}"},
            {"appletsecurityexception.getsecuritycontext.unknown", "\u7C7B\u52A0\u8F7D\u5668\u7C7B\u578B\u672A\u77E5\u3002\u65E0\u6CD5\u68C0\u67E5 getContext"},
            {"appletsecurityexception.checkread.unknown", "\u7C7B\u52A0\u8F7D\u5668\u7C7B\u578B\u672A\u77E5\u3002\u65E0\u6CD5\u4E3A\u68C0\u67E5\u8BFB\u53D6\u6743\u9650{0}\u800C\u8FDB\u884C\u68C0\u67E5"},
            {"appletsecurityexception.checkconnect.unknown", "\u7C7B\u52A0\u8F7D\u5668\u7C7B\u578B\u672A\u77E5\u3002\u65E0\u6CD5\u4E3A\u68C0\u67E5\u8FDE\u63A5\u800C\u8FDB\u884C\u68C0\u67E5"},
        };

        return temp;
    }
}
