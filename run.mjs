import('./build/out/jco/kco-wasm-wasi.mjs').then(x => {
    console.log("Result from Kotlin:")
    console.log(x.kotlin.test())
    console.log("Result from Rust:")
    console.log(x.rust.test())
});
