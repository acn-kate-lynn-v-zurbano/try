job('example') {
	steps {
		// assumes default repo system (NexusOSS)
	    artifactPromotion {
	      groupId("com.example.test")
	      artifactId("my-artifact")
	      version("1.0.0")
	      extension("zip")
	      stagingRepository("http://nexus.myorg.com:8080/content/repositories/release-candidates", "foo", "s3cr3t", false)
	      releaseRepository("http://nexus.myorg.com:8080/content/repositories/releases", "foo", "s3cr3t")
	    }
	}
}
