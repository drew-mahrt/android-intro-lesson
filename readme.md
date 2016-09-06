---
title: Intro to Android
type: lab
duration: "1:05"
creator:
    name: James Davis
    city: NYC
---

<!-- OUTSTANDING
 1. Checks
 2. Insert of section showing students how to create a new app.
 3. Examples of manufacturers and devices in Introduction: Welcome to Android
 4. We will have many devices in class: we should include a section on using the devices we have for students
 5. Describe what Android versions are and how they affect code and usability
 6. Include sections that address the first two objectives:

	 * Identify the UI building blocks of a simple Android app
	 * Match specific components and functions of a given app to code
 -->

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Introduction to Android

### Objectives
*After this lesson, students will be able to:*

* Discuss the basics of Android
* Create an app together

## Opening (5 mins)

#### What is Android?

Android is an mobile operating system maintained by Google. It's an open source project, meaning that [anyone can download the source code of the operating system](https://source.android.com/source/index.html) and modify it for free.

Android is not based on Apple or Microsoft technologies; it's a distribution of Linux.

## Introduction: Welcome to Android! (15 mins)

#### Many Devices

Android is known for having many devices by a bunch of manufacturers (as opposed to iOS having a handful of devices and one manufacturer).

> Check: Predict the pros and cons of having multiple devices from different companies? What are the drawbacks?

**Pros**

* More choice to the consumer
* Can get different devices at different price points
* Much like a laptop, you can buy devices with different specifications (better RAM, more storage, etc)
* Brand loyalty. For example, if you are a Samsung fan and buy everything Samsung, then you are in luck!

**Cons**

* Too much choice for the consumer! There's such a large number of devices that it may be confusing for the consumer
	* [The burden of choice](https://www.psychologytoday.com/blog/more-tech-support/201011/the-burden-choice): Psychologically, too much choice can be paralyzing.
		* When you look at a menu with a lot of choices, the brain keeps bouncing back and forth, indecisively, looking for the best food to eat. This isn't a huge issue for menus with only a few choices.
	* **Pro?**: If you can afford them, there are a handful of _really really_ good, [well advertised Android phones](http://www.androidauthority.com/best-android-phones-568001) to choose from.
		* This limits the consumer's choices from hundreds to less than 10, but only if you have the funds for them.

#### Versions

You may have heard of Android referred to as Lollipop, Marshmallow, or KitKat.

These are the names of all of the versions. Think of how domain names represent IP addresses.  It's easier to remember Facebook.com instead of 69.63.176.13!

Google probably thought it was more difficult to remember "Android 5.0, 5.1, 4.2" or any of the other version numbers. As of today, there have been 10 major releases of Android, with Marshmallow being the most recent.

Yes, all of the versions have the names of candies or sweets. But the thing to take away is that they are named in alphabetical order!

Donut, Eclair, Froyo, Gingerbread, Honeycomb, Ice Cream Sandwich, Jellybean, KitKat, Lollipop, Marshmallow.

[Here's how the version are broken down, and how many people own each version.](http://developer.android.com/about/dashboards/index.html) As of today, most people own KitKat and Lollipop devices (as Marshmallow is still new).

## Demo: Developing for Android (20 mins)

There are two things required to be a successful Android developer: Android Studio, and at least one device to install your app.

#### Android Studio

> Instructor Note: Open Android studio as you explain this section.

An IDE ([Integrated development environment](https://en.wikipedia.org/wiki/Integrated_development_environment)) is an application that provides a way to program applications.

Some popular ones are Visual Studio, Eclipse, and IntelliJ IDEA.

[Android Studio](http://developer.android.com/sdk/index.html) is an IDE that is used to develop Android apps. It's a specialized version of IntelliJ and will be the program used throughout this course.

Note: Eclipse was the IDE previously used for Android app development. However, Android Studio is backed by Google directly and has more support in general; it also comes prepackaged with almost everything you will need.

#### Running your app on a device

As you build and test your app, you have to run it on a device to make sure it behaves as expected. There are two ways to do that:

**1. Using a physical device** -  It's *almost always* best to use an actual phone or tablet to test your app. The users would be using your app on a phone, so testing on one is ideal. Try to have at least one phone nearby to test on.

However, as mentioned in previous sections, there are many devices with varying screen sizes and a handful of versions for each device. Realistically, it's not possible to have access to every combination of device and version.

> Check: To combat this issue, some developers believe in testing their app against the smaller selection of latest and more popular devices. Why would this possibly be a bad thing?

 Not everyone has the latest phones or versions.  You would be excluding a subset of people with older devices and versions who might be experiencing problems with you app that newer phones aren't experiencing.

 This is especially true for customers in developing countries, where the latest phones either are not available or not as popular as their cheaper counterparts.

 One way of attempting to test multiple devices that you have no physical access to is to use virtual devices.

**2. Using a virtual device** - You can emulate many Android devices on your computer!

Android provided a Virtual Device Manager that allows you to configure a virtual Android device. You can make one from scratch, defining things like ram, screen size, etc., or you can use predefined virtual devices based on actual devices. For instance, you can have a virtual version of the Nexus 5 or the Samsung Galaxy devices.

You can also run an application called [Genymotion](https://www.genymotion.com/), which is another, faster version of the official Android Virtual Device Manager. It's not supported by Google, but it is a great resource.

One drawback is that because these are virtual, there are some things you can't test easily, like using Google Maps, GPS, or other Google Play-related services. However, if you don't have access to a physical device, a virtual one is your best option.

## Guided Practice - Exploring Android Studio (20 mins)

Now that we know all of the tools, let's open and run an app in Android Studio.

* Together, let's open the [supplied app](starter-code) in Android Studio.
* Let's discuss the major parts of the IDE:
	* Project View and Structure
	* Java Code Editor
	* View > Tool Windows - General overview
* Finally, let's run the app and build it to a device

> Instructor Note: Walk students through building the application and the files and folders they'll be working out of. Additionally, walk through how to enable Developer Mode on their Android Devices. [Developer Mode Instructions](https://developer.android.com/tools/device.html)

## Conclusion (5 mins)

- What is Android Studio?
- What are the versions of Android named after?
