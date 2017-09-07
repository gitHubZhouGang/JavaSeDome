package com.classload;

import java.net.URL;
import java.net.URLClassLoader;

public class GetClassLoaderInfo {

	public static void main(String[] args) {
		System.out.println("BootstrapClassLoader �ļ���·��: ");
		
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for (URL url : urls)
			System.out.println(url);
		System.out.println("----------------------------");

		// ȡ����չ�������
		URLClassLoader extClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader().getParent();

		System.out.println("��չ���������" + extClassLoader);
		System.out.println("��չ������� �ļ���·��: ");

		urls = extClassLoader.getURLs();
		for (URL url : urls)
			System.out.println(url);

		System.out.println("----------------------------");

		// ȡ��Ӧ��(ϵͳ)�������
		URLClassLoader appClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();

		System.out.println("Ӧ�����������"+appClassLoader);
		System.out.println("Ӧ��(ϵͳ)������� �ļ���·��: ");

		urls = appClassLoader.getURLs();
		for (URL url : urls)
			System.out.println(url);

		System.out.println("----------------------------");
	}

}
