package com.dburyak.vertx.core;

import com.dburyak.vertx.core.deployment.spec.Deployment;

public class DeployerVerticle extends Verticle {
    private final Deployment deployment;

    public DeployerVerticle(Deployment deployment) {
        this.deployment = deployment;
    }
}
