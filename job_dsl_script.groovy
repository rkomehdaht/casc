job('demo') {
    steps {
        shell('echo Hello World!')
    }
}
job('demo2') {
    steps {
        shell('echo Bye World!')
    }
}