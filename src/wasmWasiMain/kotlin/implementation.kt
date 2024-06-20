object KotlinExportsImpl : KotlinExports {
    override fun test(): Result<Boolean> {
        return Result.success(true)
    }
}

object RustExportsImpl : RustExports {
    override fun test(): Result<Boolean> {
        return Rust.test()
    }
}
