package com.astracore.engine;

public class ModelRouter {
    public void route(String task) {
        // যদি টাস্কটি ছোট হয়, লোকাল মডেল ইউজ করবে
        if (task.length() < 100) {
            System.out.println("Routing to Local AI Engine...");
            // LocalInferenceEngine.process(task);
        } else {
            // বড় কাজের জন্য ক্লাউড এপিআই
            System.out.println("Routing to Cloud API for better precision...");
            // CloudApiConnector.process(task);
        }
    }
}
