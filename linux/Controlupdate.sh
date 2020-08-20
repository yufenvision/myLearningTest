#!/bin/bash
#Version 1.0.2
#本次更新前端一键部署功能
code="/root/code"

JB_Tomcat_Path="/nfs/apache-tomcat-8098"
JB_code_dir="$JB_Tomcat_Path/webapps"
JB_hconf_Path="$JB_code_dir/hezhangtong/WEB-INF/classes"
JB_mconf_Path="$JB_code_dir/mhezhangtong/WEB-INF/classes"

ZG_Tomcat_Path="/nfs/apache-tomcat-7098"
ZG_code_dir="$ZG_Tomcat_Path/webapps"
ZG_hconf_Path="$ZG_code_dir/hezhangtong/WEB-INF/classes"
ZG_mconf_Path="$ZG_code_dir/mhezhangtong/WEB-INF/classes"

H5_code_Path="/nfs/hezhangtong/h5"
JB_h5_code_Path="$H5_code_Path/jingbian"
ZG_h5_code_Path="$H5_code_Path/zhugan"


echo "V1.0.2使用说明：
		1.将需部署的代码包放在/root/
		2.后台暂时只支持包名为 hezhangtong.war mhezhangtong.war
		3.前端暂时只支持包名为 web-dist.zip app-dist.zip
		3.本程序暂不支持备份，请谨慎操作
		4.代码配置文件使用的是服务器上的配置文件，有更新请自行线上配置修改后再执行"
echo ''
echo '			V1.0.3更新apk更新功能'
echo '			V1.0.4更新性能控制台'

echo "			按任意键继续......"
read -n 1

while true
do
clear
echo "
/------------------------------------\\"

echo "|          代码更新操作              |
|                                    |
|      1.二期靖边测试后台代码更新    |
|      2.二期主干测试后台代码更新    |
|      3.靖边测试前端更新(暂未开通)  |
|      4.主干测试前端更新(暂未开通)  |
|      5.退出                        |
|------------------------------------|"

read -p "请输入操作编号（1-5）：" num
case $num in
1)
	while true
	do
	clear
	echo "
/------------------------------------\\"

echo "|      二期靖边测试后台代码更新      |
|                                    |
|      1.hezhangtong代码更新         |
|      2.mhezhangtong代码更新        |
|      3.全部更新                    |
|      4.退出                        |
|------------------------------------|"
	read -p "请输入操作编号（1-4）：" name
	case $name in
	1)
		mkdir $code
		unzip -O UTF-8 hezhangtong.war -d $code/hezhangtong
		cd $code/hezhangtong/WEB-INF/classes/
		cp -f $JB_hconf_Path/sysConfig.properties .
		cp -f $JB_hconf_Path/dbconfig.properties .
		cp -f $JB_hconf_Path/log4j.properties .
		Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
		echo "正在停止Tomcat......"
		kill -9 $Pid
		sleep 1
		Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
		if [ ! -n "$Pid" ];then
			echo "tomcat已停止！"
			echo 3 > /proc/sys/vm/drop_caches
			cd $JB_code_dir
			rm -rf hezhangtong
			mv $code/* .
			sh $JB_Tomcat_Path/bin/startup.sh
			Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
			if [ -n "$Pid" ];then
				echo "Tomcat已启动！"
			else
				echo "Tomcat启动失败，请查看日志解决问题，手动启动。"
				exit
		fi
			echo "开始清理冗余....."
			rm -rf $code
			sleep  2
			echo "更新完成！即将退出...."
			sleep  2
			exit
		else
			echo "tomcat未停止请手动检查Tomcat"
			echo "开始清理冗余....."
			rm -rf $code
			sleep 3
			exit
		fi
	;;
	2)
		mkdir $code
		unzip -O UTF-8 mhezhangtong.war -d $code/mhezhangtong
		cd $code/mhezhangtong/WEB-INF/classes/
		cp -f $JB_mconf_Path/zyqt.properties .
		cp -f $JB_mconf_Path/jdbc.properties .
		cp -f $JB_mconf_Path/log4j.properties .
		Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
		echo "正在停止Tomcat......"
		kill -9 $Pid
		sleep 1
		Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
		if [ ! -n "$Pid" ];then
			echo "tomcat已停止！"
			echo 3 > /proc/sys/vm/drop_caches
			cd $JB_code_dir
			rm -rf mhezhangtong
			mv $code/* .
			sh $JB_Tomcat_Path/bin/startup.sh
			Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
			if [ -n "$Pid" ];then
				echo "Tomcat已启动！"
			else
				echo "Tomcat启动失败，请查看日志解决问题，手动启动。"
				exit
			fi
			echo "开始清理冗余....."
			rm -rf $code
			sleep  2
			echo "更新完成！即将退出...."
			sleep 2
			exit
		else
			echo "tomcat未停止请手动检查Tomcat"
			echo "开始清理冗余....."
			rm -rf $code
			sleep 3
			exit
		fi
	;;
	3)
		mkdir $code
		unzip -O UTF-8 hezhangtong.war -d $code/hezhangtong
		unzip -O UTF-8 mhezhangtong.war -d $code/mhezhangtong
		cd $code/hezhangtong/WEB-INF/classes/
		cp -f $JB_hconf_Path/sysConfig.properties .
		cp -f $JB_hconf_Path/dbconfig.properties .
		cp -f $JB_hconf_Path/log4j.properties .
		cd $code/mhezhangtong/WEB-INF/classes/
		cp -f $JB_mconf_Path/zyqt.properties .
		cp -f $JB_mconf_Path/jdbc.properties .
		cp -f $JB_mconf_Path/log4j.properties .
		Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
		echo "正在停止Tomcat......"
		kill -9 $Pid
		sleep 1
		Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
		if [ ! -n "$Pid" ];then
			echo "tomcat已停止！"
			echo 3 > /proc/sys/vm/drop_caches
			cd $JB_code_dir
			rm -rf mhezhangtong hezhangtong
			mv $code/* .
			sh $JB_Tomcat_Path/bin/startup.sh
			Pid=$(ps -ef |grep 'tomcat-8098'|grep -v 'grep'|awk '{print $2}')
			if [ -n "$Pid" ];then
				echo "Tomcat已启动！"
			else
				echo "Tomcat启动失败，请查看日志解决问题，手动启动。"
				exit
			fi
			echo "开始清理冗余....."
			rm -rf $code
			sleep  2
			echo "更新完成！即将退出...."
			sleep 2
			exit
		else
			echo "tomcat未停止请手动检查Tomcat"
			echo "开始清理冗余....."
			rm -rf $code
			sleep 3
			exit
		fi
	;;
	4)
		exit
	;;
	*)
		echo "输入不识别！请重新输入1-4！"
		sleep 2
	;;
	esac
	done
;;

2)
	while true
	do
	clear
	echo "
/------------------------------------\\"

echo "|      二期主干测试后台代码更新      |
|                                    |
|      1.hezhangtong代码更新         |
|      2.mhezhangtong代码更新        |
|      3.全部更新                    |
|      4.退出                        |
|------------------------------------|"
	read -p "请输入操作编号（1-4）：" name
	case $name in
	1)
		mkdir $code
		unzip -O UTF-8 hezhangtong.war -d $code/hezhangtong
		cd $code/hezhangtong/WEB-INF/classes/
		cp -f $ZG_hconf_Path/sysConfig.properties .
		cp -f $ZG_hconf_Path/dbconfig.properties .
		cp -f $ZG_hconf_Path/log4j.properties .
		Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
		echo "正在停止Tomcat......"
		kill -9 $Pid
		sleep 1
		Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
		if [ ! -n "$Pid" ];then
			echo "tomcat已停止！"
			echo 3 > /proc/sys/vm/drop_caches
			cd $ZG_code_dir
			rm -rf hezhangtong
			mv $code/* .
			sh $ZG_Tomcat_Path/bin/startup.sh
			Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
			if [ -n "$Pid" ];then
				echo "Tomcat已启动！"
			else
				echo "Tomcat启动失败，请查看日志解决问题，手动启动。"
				exit
			fi
			echo "开始清理冗余....."
			rm -rf $code
			sleep  2
			echo "更新完成！即将退出...."
			sleep  2
			exit
		else
			echo "tomcat未停止请手动检查Tomcat"
			echo "开始清理冗余....."
			rm -rf $code
			sleep 3
			exit
		fi
	;;
	2)
		mkdir $code
		unzip -O UTF-8 mhezhangtong.war -d $code/mhezhangtong
		cd $code/mhezhangtong/WEB-INF/classes/
		cp -f $ZG_mconf_Path/zyqt.properties .
		cp -f $ZG_mconf_Path/jdbc.properties .
		cp -f $ZG_mconf_Path/log4j.properties .
		Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
		echo "正在停止Tomcat......"
		kill -9 $Pid
		sleep 1
		Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
		if [ ! -n "$Pid" ];then
			echo "tomcat已停止！"
			echo 3 > /proc/sys/vm/drop_caches
			cd $ZG_code_dir
			rm -rf mhezhangtong
			mv $code/* .
			sh $ZG_Tomcat_Path/bin/startup.sh
			Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
			if [ -n "$Pid" ];then
				echo "Tomcat已启动！"
			else
				echo "Tomcat启动失败，请查看日志解决问题，手动启动。"
				exit
			fi
			echo "开始清理冗余....."
			rm -rf $code
			sleep  2
			echo "更新完成！即将退出...."
			sleep 2
			exit
		else
			echo "tomcat未停止请手动检查Tomcat"
			echo "开始清理冗余....."
			rm -rf $code
			sleep 3
			exit
		fi
	;;
	3)
		mkdir $code
		unzip -O UTF-8 hezhangtong.war -d $code/hezhangtong
		unzip -O UTF-8 mhezhangtong.war -d $code/mhezhangtong
		cd $code/hezhangtong/WEB-INF/classes/
		cp -f $ZG_hconf_Path/sysConfig.properties .
		cp -f $ZG_hconf_Path/dbconfig.properties .
		cp -f $ZG_hconf_Path/log4j.properties .
		cd $code/mhezhangtong/WEB-INF/classes/
		cp -f $ZG_mconf_Path/zyqt.properties .
		cp -f $ZG_mconf_Path/jdbc.properties .
		cp -f $ZG_mconf_Path/log4j.properties .
		Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
		echo "正在停止Tomcat......"
		kill -9 $Pid
		sleep 1
		Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
		if [ ! -n "$Pid" ];then
			echo "tomcat已停止！"
			echo 3 > /proc/sys/vm/drop_caches
			cd $ZG_code_dir
			rm -rf mhezhangtong hezhangtong
			mv $code/* .
			sh $ZG_Tomcat_Path/bin/startup.sh
			Pid=$(ps -ef |grep 'tomcat-7098'|grep -v 'grep'|awk '{print $2}')
			if [ -n "$Pid" ];then
				echo "Tomcat已启动！"
			else
				echo "Tomcat启动失败，请查看日志解决问题，手动启动。"
				exit
			fi
			echo "开始清理冗余....."
			rm -rf $code
			sleep  2
			echo "更新完成！即将退出...."
			sleep 2
			exit
		else
			echo "tomcat未停止请手动检查Tomcat"
			echo "开始清理冗余....."
			rm -rf $code
			sleep 3
			exit
		fi
	;;
	4)
		exit
	;;
	*)
		echo "输入不识别！请重新输入1-4！"
		sleep 2
	;;
	esac
	done
;;

3)
	while true
	do
	clear
    echo "
/------------------------------------\\"

echo "|          靖边测试前端更新          |
|                                    |
|      1.web前端代码更新             |
|      2.app前端代码更新             |
|      3.全部更新                    |
|      4.退出                        |
|------------------------------------|"
	read -p "请输入操作编号（1-4）：" name
	case $name in
	1)
		cd $JB_h5_code_Path
		rm -rf web
		mv /root/web-dist.zip .
		unzip -O UTF-8 web-dist.zip -d web
		Tag=`ls web|wc -l`
		ls web/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd web/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		echo "开始清理冗余...."
		sleep 2
		rm -rf $JB_h5_code_Path/*.zip
		echo 'web前端代码更新完成！！'
		sleep 2
	;;

	2)
		cd $JB_h5_code_Path
		rm -rf h5
		mv /root/app-dist.zip .
		unzip -O UTF-8 app-dist.zip -d h5
		Tag=`ls h5|wc -l`
		ls h5/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd h5/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		echo "开始清理冗余...."
		sleep 2
		rm -rf $JB_h5_code_Path/*.zip
		echo 'app前端代码更新完成！！'
		sleep 2
	;;
	3)
		cd $JB_h5_code_Path
		rm -rf web h5
		mv /root/web-dist.zip .
		mv /root/app-dist.zip .
		unzip -O UTF-8 web-dist.zip -d web
		unzip -O UTF-8 app-dist.zip -d h5
		Tag=`ls web|wc -l`
		ls web/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd web/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		Tag=`ls h5|wc -l`
		ls h5/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd h5/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		echo "开始清理冗余...."
		sleep 2
		rm -rf $JB_h5_code_Path/*.zip
		echo 'app web前端代码更新完成！！'
		sleep 2
		;;
	4)
		exit
	;;
	*)
		echo "输入不识别！请重新输入1-4！"
		sleep 2
	;;
	esac
	done
;;

4)
	while true
	do
	clear
    echo "
/------------------------------------\\"

echo "|          主干测试前端更新          |
|                                    |
|      1.web前端代码更新             |
|      2.app前端代码更新             |
|      3.全部更新                    |
|      4.退出                        |
|------------------------------------|"
	read -p "请输入操作编号（1-4）：" name
	case $name in
	1)
		cd $ZG_h5_code_Path
		rm -rf web
		mv /root/web-dist.zip .
		unzip -O UTF-8 web-dist.zip -d web
		Tag=`ls web|wc -l`
		ls web/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd web/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		echo "开始清理冗余...."
		sleep 2
		rm -rf $ZG_h5_code_Path/*.zip
		echo 'web前端代码更新完成！！'
		sleep 2
	;;

	2)
		cd $ZG_h5_code_Path
		rm -rf app
		mv /root/app-dist.zip .
		unzip -O UTF-8 app-dist.zip -d h5
		Tag=`ls h5|wc -l`
		ls h5/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd h5/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		echo "开始清理冗余...."
		sleep 2
		rm -rf $ZG_h5_code_Path/*.zip
		echo 'app前端代码更新完成！！'
		sleep 2
	;;
	3)
		cd $ZG_h5_code_Path
		rm -rf web h5
		mv /root/web-dist.zip .
		mv /root/app-dist.zip .
		unzip -O UTF-8 web-dist.zip -d web
		unzip -O UTF-8 app-dist.zip -d h5
		Tag=`ls web|wc -l`
		ls web/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd web/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		Tag=`ls h5|wc -l`
		ls h5/|grep 'dist'
		if [ $Tag -eq 1 ] -a [ $? -eq 0]
		then
			cd h5/dist
			mv ./* ../
			cd ../
			rm -rf dist
		fi
		echo "开始清理冗余...."
		sleep 2
		rm -rf $ZG_h5_code_Path/*.zip
		echo 'app web前端代码更新完成！！'
		sleep 2
	;;
	4)
		exit
	;;
	*)
		echo "输入不识别！请重新输入1-4！"
		sleep 2
	;;
	esac
	done

;;
5)
	exit
;;
*)
	echo "输入不识别！请重新输入1-5！"
	sleep 2
;;
esac
done

