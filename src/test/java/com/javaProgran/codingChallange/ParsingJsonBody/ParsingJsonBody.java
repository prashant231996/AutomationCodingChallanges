package com.javaProgran.codingChallange.ParsingJsonBody;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;

public class ParsingJsonBody {

	public static void main(String[] args) throws JSONException {
		// TODO Auto-generated method stub
		String responseInString="{\r\n" + 
				"    \"books\":[\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781593279509\",\r\n" + 
				"            \"title\":\"Eloquent JavaScript, Third Edition\",\r\n" + 
				"            \"subtitle\":\"A Modern Introduction to Programming\",\r\n" + 
				"            \"author\":\"Marijn Haverbeke\",\r\n" + 
				"            \"published\":\"2018-12-04T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"No Starch Press\",\r\n" + 
				"            \"pages\":472,\r\n" + 
				"            \"description\":\"JavaScript lies at the heart of almost every modern web application, from social apps like Twitter to browser-based game frameworks like Phaser and Babylon. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale applications.\",\r\n" + 
				"            \"website\":\"http://eloquentjavascript.net/\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781491943533\",\r\n" + 
				"            \"title\":\"Practical Modern JavaScript\",\r\n" + 
				"            \"subtitle\":\"Dive into ES6 and the Future of JavaScript\",\r\n" + 
				"            \"author\":\"Nicol�s Bevacqua\",\r\n" + 
				"            \"published\":\"2017-07-16T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"O'Reilly Media\",\r\n" + 
				"            \"pages\":334,\r\n" + 
				"            \"description\":\"To get the most out of modern JavaScript, you need learn the latest features of its parent specification, ECMAScript 6 (ES6). This book provides a highly practical look at ES6, without getting lost in the specification or its implementation details.\",\r\n" + 
				"            \"website\":\"https://github.com/mjavascript/practical-modern-javascript\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781593277574\",\r\n" + 
				"            \"title\":\"Understanding ECMAScript 6\",\r\n" + 
				"            \"subtitle\":\"The Definitive Guide for JavaScript Developers\",\r\n" + 
				"            \"author\":\"Nicholas C. Zakas\",\r\n" + 
				"            \"published\":\"2016-09-03T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"No Starch Press\",\r\n" + 
				"            \"pages\":352,\r\n" + 
				"            \"description\":\"ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that ECMAScript 6 brings to JavaScript.\",\r\n" + 
				"            \"website\":\"https://leanpub.com/understandinges6/read\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781449365035\",\r\n" + 
				"            \"title\":\"Speaking JavaScript\",\r\n" + 
				"            \"subtitle\":\"An In-Depth Guide for Programmers\",\r\n" + 
				"            \"author\":\"Axel Rauschmayer\",\r\n" + 
				"            \"published\":\"2014-04-08T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"O'Reilly Media\",\r\n" + 
				"            \"pages\":460,\r\n" + 
				"            \"description\":\"Like it or not, JavaScript is everywhere these days -from browser to server to mobile- and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who once found himself in the same position.\",\r\n" + 
				"            \"website\":\"http://speakingjs.com/\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781449331818\",\r\n" + 
				"            \"title\":\"Learning JavaScript Design Patterns\",\r\n" + 
				"            \"subtitle\":\"A JavaScript and jQuery Developer's Guide\",\r\n" + 
				"            \"author\":\"Addy Osmani\",\r\n" + 
				"            \"published\":\"2012-08-30T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"O'Reilly Media\",\r\n" + 
				"            \"pages\":254,\r\n" + 
				"            \"description\":\"With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.\",\r\n" + 
				"            \"website\":\"http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9798602477429\",\r\n" + 
				"            \"title\":\"You Don't Know JS Yet\",\r\n" + 
				"            \"subtitle\":\"Get Started\",\r\n" + 
				"            \"author\":\"Kyle Simpson\",\r\n" + 
				"            \"published\":\"2020-01-28T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"Independently published\",\r\n" + 
				"            \"pages\":143,\r\n" + 
				"            \"description\":\"The worldwide best selling You Don't Know JS book series is back for a 2nd edition: You Don't Know JS Yet. All 6 books are brand new, rewritten to cover all sides of JS for 2020 and beyond.\",\r\n" + 
				"            \"website\":\"https://github.com/getify/You-Dont-Know-JS/tree/2nd-ed/get-started\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781484200766\",\r\n" + 
				"            \"title\":\"Pro Git\",\r\n" + 
				"            \"subtitle\":\"Everything you neeed to know about Git\",\r\n" + 
				"            \"author\":\"Scott Chacon and Ben Straub\",\r\n" + 
				"            \"published\":\"2014-11-18T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"Apress; 2nd edition\",\r\n" + 
				"            \"pages\":458,\r\n" + 
				"            \"description\":\"Pro Git (Second Edition) is your fully-updated guide to Git and its usage in the modern world. Git has come a long way since it was first developed by Linus Torvalds for Linux kernel development. It has taken the open source world by storm since its inception in 2005, and this book teaches you how to use it like a pro.\",\r\n" + 
				"            \"website\":\"https://git-scm.com/book/en/v2\"\r\n" + 
				"        },\r\n" + 
				"        {\r\n" + 
				"            \"isbn\":\"9781484242216\",\r\n" + 
				"            \"title\":\"Rethinking Productivity in Software Engineering\",\r\n" + 
				"            \"subtitle\":\"\",\r\n" + 
				"            \"author\":\"Caitlin Sadowski, Thomas Zimmermann\",\r\n" + 
				"            \"published\":\"2019-05-11T00:00:00.000Z\",\r\n" + 
				"            \"publisher\":\"Apress\",\r\n" + 
				"            \"pages\":310,\r\n" + 
				"            \"description\":\"Get the most out of this foundational reference and improve the productivity of your software teams. This open access book collects the wisdom of the 2017 \\\"Dagstuhl\\\" seminar on productivity in software engineering, a meeting of community leaders, who came together with the goal of rethinking traditional definitions and measures of productivity.\",\r\n" + 
				"            \"website\":\"https://doi.org/10.1007/978-1-4842-4221-6\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}";
		
		//Approch 1->Parsing Json Body using JsonPath
	    JsonPath js=new JsonPath(responseInString);
	    //Printing the size of books array list
//		List<Object>booksList=js.get("books");
//		System.out.println("Size of book list is "+booksList.size());
		//Approch 2-> Using JSONObject class
		JSONObject jsonObject=new JSONObject(responseInString);
		//Printing the size of books array list
		System.out.println("Size of book list is "+jsonObject.getJSONArray("books").length());
		System.out.println("Printing books titles of all the books");
		//Printing the book titles for the books having more that 500 pages & Verifying total number of pages
		int totalPages=0;
		for(int i=0;i<jsonObject.getJSONArray("books").length();i++)
		{
			   JSONObject jo=jsonObject.getJSONArray("books").getJSONObject(i);
			   totalPages=totalPages+Integer.parseInt(jo.get("pages").toString());
			   if((Integer.parseInt(jo.get("pages").toString())>400))
			    {
			      System.out.println("Title of book is having more that 500 pages "+jo.get("title").toString()+" having page count as "+jo.get("pages").toString());
			    }
		}
		System.out.println("Total number of pages are "+totalPages);
	}

}
